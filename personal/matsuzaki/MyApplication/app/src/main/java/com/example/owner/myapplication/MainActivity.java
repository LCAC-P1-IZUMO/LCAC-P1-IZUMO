package com.example.owner.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //**************************//
    //****** コントロール ******//
    //**************************//
    /*開始ボタン*/
    private Button mBtnStart;

    /*ダイアログ*/
    private AlertDialog.Builder mDialog;

    //**************************//
    //**** イベントリスナー ****//
    //**************************//
    /*開始ボタンをクリックしたときの処理*/
    private Button.OnClickListener mEvlBtnStart = new Button.OnClickListener() {
        public void onClick(View v) {
            mDialog
                .setTitle("タイトル")
                .setMessage("開始ボタンが押されてしまった")
                .create()
                .show()
            ;
        }
    };

    //**************************//
    //******** onCreate ********//
    //**************************//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //**** インスタンスをセット ****//
        // 開始ボタン
        mBtnStart = (Button)findViewById(R.id.btnStart);

        // ダイアログ
        mDialog = new AlertDialog.Builder(this);

        //**** イベントリスナーをコントロールにセット ****//
        // 開始ボタン
        mBtnStart.setOnClickListener(mEvlBtnStart);
    }
}
