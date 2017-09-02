package com.example.lcac_p1_izumo;


//使用するライブラリの定義
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;

//クラスの設定
public class a03 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // この画面のIDを設定
        setContentView(R.layout.a03);

        // 画面遷移ボタンの設定
        // findViewById(R.id.ボタンのID)
        Button b = (Button)findViewById(R.id.button_BACK);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //intentの作成
                //Intent(この画面のID.this, 呼出す画面のID.class)
                Intent intent = new Intent(a03.this, a02.class);
                //intentをスタート
                startActivity(intent);
            }
        });
        // 画面遷移ボタンの設定
        // findViewById(R.id.ボタンのID)
        Button n = (Button)findViewById(R.id.Button_NEXT);
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //intentの作成
                //Intent(この画面のID.this, 呼出す画面のID.class)
                Intent intent = new Intent(a03.this, a04.class);
                //intentをスタート
                startActivity(intent);
            }
        });
    }

    //ボタンのイベント_@+id/Button_NET
}
