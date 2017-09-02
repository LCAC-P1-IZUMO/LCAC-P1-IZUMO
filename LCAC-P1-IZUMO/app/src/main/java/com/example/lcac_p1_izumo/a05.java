package com.example.lcac_p1_izumo;

//使用するライブラリの定義
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;

//クラスの設定
public class a05 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // この画面のIDを設定
        setContentView(R.layout.a05);

        // 前ページへ
        // findViewById(R.id.ボタンのID)
        Button b = (Button)findViewById(R.id.Button_BACK);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //intentの作成
                //Intent(この画面のID.this, 呼出す画面のID.class)
                Intent intent = new Intent(a05.this, a04.class);
                //intentをスタート
                startActivity(intent);
            }
        });
    }

    public void onClick_btn_mail(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);
        //intent.setData(Uri.parse("mailto:a@hage.net"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "タイトル");
        intent.putExtra(Intent.EXTRA_TEXT, "本文です。");
        //createChooserを使うと選択ダイアログのタイトルを変更する事ができます。
        startActivity(Intent.createChooser(intent,"select"));
        //通常のブラウザ起動です。
        //startActivity(intent);
    }
}
