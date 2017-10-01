package com.example.owner.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubFormSendMail extends Activity {
    //**********************************************************
    //******************    定数・列挙体    ********************
    //**********************************************************

    //**********************************************************
    //******************     メンバ変数     ********************
    //**********************************************************

    //**********************************************************
    //******************    コントロール    ********************
    //**********************************************************
    /**
     * [メールを送信]ボタン
     */
    private Button m_btnSendMail;

    //**********************************************************
    //******************  イベントリスナー  ********************
    //**********************************************************
    /**
     * [メールを送信]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnSendMail = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            sendMail();
            // トースト表示
            Toast.makeText(
                    SubFormSendMail.this,
                    "メールを送信が選択された",
                    Toast.LENGTH_SHORT
            ).show();
        }
    };

    //**********************************************************
    //******************      メソッド      ********************
    //**********************************************************
    private void sendMail() {
        // インテントのインスタンス生成
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);

        // 宛先
        intent.setData(Uri.parse("mailto:xxxx@hotmail.co.jp"));

        // 標題
        intent.putExtra(Intent.EXTRA_SUBJECT, "表題だよー");

        // 本文
        intent.putExtra(Intent.EXTRA_TEXT, "適当な本文書いた");

        // メール起動
        startActivity(intent);
    }
    //**********************************************************
    //******************      onCreate      ********************
    //**********************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_form_send_mail);

        //**** コントロールのインスタンスを取得 ****//
        // [メール送信画面へ遷移]ボタン
        m_btnSendMail = (Button)findViewById(R.id.btnSendMail);

        //**** コントロールにイベントリスナーを設定 ****//
        // [メール送信画面へ遷移]ボタン
        m_btnSendMail.setOnClickListener(onClick_btnSendMail);

        //**** 初期処理 ****//
    }

    //**********************************************************
    //******************      onKeyDown     ********************
    //**********************************************************
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            // 戻るボタンが押下された
            case KeyEvent.KEYCODE_BACK: {
                // タスクを削除して終了
                finishAndRemoveTask();
            }
        }
        return true;
    }
}