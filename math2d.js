/**
* コンストラクタ
* @param {number} x
* @param {number} y
*/
function Vec2(x, y) {
	this.X = x;
	this.Y = y;
}

/**
*
*/
Vec2.ToRad = Math.atan(1.0) / 45.0;

/**
*
*/
Vec2.ToDeg = 45.0 / Math.atan(1.0);

/**
* 極座標指定からベクトルを取得
* @param  {number} radius 長さ
* @param  {number} angle  角度(弧度)
* @return {Vec2}
*/
Vec2.FromPhaser = function(radius, angle) {
	return new Vec2(radius * Math.cos(angle), radius * Math.sin(angle));
};

/**
* インスタンスコピー
*/
Vec2.prototype.Copy = function() {
	return new Vec2(this.X, this.Y);
};

/**
* 加算
* @param  {Vec2} v 加える値
* @return {Vec2} 自身に引数(v)を加えた値
*/
Vec2.prototype.Add = function(v) {
	return new Vec2(this.X + v.X, this.Y + v.Y);
};

/**
* 減算
* @param  {Vec2} v 引く値
* @return {Vec2} 自身から引数(v)を引いた値
*/
Vec2.prototype.Sub = function(v) {
	return new Vec2(this.X - v.X, this.Y - v.Y);
};

/**
* 正規化
* @return {Vec2} 正規化した値
*/
Vec2.prototype.Norm = function() {
	var r = Math.sqrt(this.X*this.X + this.Y*this.Y);
	if (r === 0.0) {
		return Vec2.Zero();
	}
	return new Vec2(this.X / r, this.Y / r);
};

/**
* スカラー倍
* @return {Vec2} スカラー倍した値
*/
Vec2.prototype.Scalar = function(k) {
	return new Vec2(k * this.X, k * this.Y);
};

/**
* 任意の長さのベクトルを取得
* @param  {number} r 長さ
* @return {Vec2}     引数で指定された長さのベクトル
*/
Vec2.prototype.Scale = function(r) {
	var k = Math.sqrt(this.X*this.X + this.Y*this.Y);
	if (k === 0.0) {
		return Vec2.Zero();
	}
	r /= k;
	return new Vec2(r * this.X, r * this.Y);
};

/**
* 回転
* @param  {number} rad 回転させる角度(弧度)
* @return {Vec2}       引数で指定された角度によって回転した値
*/
Vec2.prototype.Rot = function(rad) {
	var r = Math.sqrt(this.X*this.X + this.Y*this.Y);
	var t = Math.atan2(this.Y, this.X) + rad;
	return new Vec2(r * Math.cos(t), r * Math.sin(t));
};

Vec2.prototype.Distance = function(v) {
	var x = v.X - this.X;
	var y = v.Y - this.Y;
	return Math.sqrt(x*x + y*y);
};

Vec2.prototype.AngleTo = function(v) {
	return Math.atan2(v.X - this.X, v.Y - this.Y);
};

/**
* ....a
* .../.
* ../..
* ./...
* o---b
* @param  {Vec2}   a 点a
* @param  {Vec2}   b 点b
* @return {number}   自身の位置(o)と点a、点bのなす角(弧度)
*/
Vec2.prototype.AngleAB = function(a, b) {
	var ao = new Vec2(a.X - this.X, a.Y - this.Y).norm();
	var bo = new Vec2(b.X - this.X, b.Y - this.Y).norm();
	return Math.acos(ao.X*bo.X + ao.Y*bo.Y);
};

/**
* .....q
* ..../|
* .../.|
* ..a..b
* ./...|
* o----p
* @param  {Vec2}   p 点p
* @param  {number} a 辺a
* @param  {number} b 辺b
* @return {Vec2}     点q
*/
Vec2.prototype.Crank = function(p, a, b) {
	var sx = p.X - this.X;
	var sy = p.Y - this.Y;
	var l = Math.sqrt(sx*sx + sy*sy);
	var c = (l*l + a*a - b*b) / (2*l*a);
	if (c > 1.0) c = 1.0;
	else if(c < -1.0) c = -1.0;
	var t = Math.atan2(sy, sx) - Math.acos(c);
	return new Vec2(a * Math.cos(t) + this.X, a * Math.sin(t) + this.Y);
};


function Line(vBegin, vEnd) {
	this.Begin = vBegin;
	this.End = vEnd;
}

Line.FromXY = function(beginX, beginY, endX, endY) {
	return new Line(new Vec2(beginX, beginY),  new Vec2(endX, endY));
};

Line.prototype.Length = function(len) {
	if(len) {
		this.End = this.Begin.Add(Vec2.FromPhaser(len, this.Angle()));
	}
	else {
		return this.Begin.Distance(this.End);
	}
};

Line.prototype.Angle = function(rad) {
	if(rad) {
		this.End = this.Begin.Add(Vec2.FromPhaser(this.Length(), rad));
	}
	else {
		return this.Begin.AngleTo(this.End);
	}
};
