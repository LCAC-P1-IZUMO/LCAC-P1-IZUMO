package com.example.lcac_p1_izumo;

// 使用するライブラリの定義
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

// クラスの設定
public class a01 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // この画面のIDを設定
        setContentView(R.layout.a01);

        // 前ページヘ
        // findViewById(R.id.ボタンのID)
        Button b = (Button)findViewById(R.id.Button_BACK);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //intentの作成
                //Intent(この画面のID.this, 呼出す画面のID.class)
                Intent intent = new Intent(a01.this, MainActivity.class);
                //intentをスタート
                startActivity(intent);
            }
        });

        // 次ページヘ
        // findViewById(R.id.ボタンのID)
        Button n = (Button)findViewById(R.id.Button_NEXT);
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //intentの作成
                //Intent(この画面のID.this, 呼出す画面のID.class)
                Intent intent = new Intent(a01.this, a02.class);
                //intentをスタート
                startActivity(intent);
            }
        });
    }
    //ボタンのイベント_@+id/Button_NET

    public void onClick_btn_save(View view){
        new AlertDialog.Builder(a01.this)
                .setTitle("保存しますか？")
                .setPositiveButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                .setNegativeButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                .show();
    }
}
