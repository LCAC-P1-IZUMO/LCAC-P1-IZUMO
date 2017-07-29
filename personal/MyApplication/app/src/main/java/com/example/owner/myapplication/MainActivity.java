package com.example.owner.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
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
     * [SubForm01へ遷移]ボタン
     */
    private Button m_btnSubForm01;
    /**
     * [SubForm02へ遷移]ボタン
     */
    private Button m_btnSubForm02;

    //**********************************************************
    //******************  イベントリスナー  ********************
    //**********************************************************
    /**
     * [SubForm01へ遷移]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnSubForm01 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [SubForm01]を開く
            Intent intent = new Intent(getApplication(), SubForm01.class);
            startActivity(intent);
        }
    };
    /**
     * [SubForm02へ遷移]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnSubForm02 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [SubForm02]を開く
            Intent intent = new Intent(getApplication(), SubForm02.class);
            startActivity(intent);
        }
    };

    //**********************************************************
    //******************      メソッド      ********************
    //**********************************************************

    //**********************************************************
    //******************      onCreate      ********************
    //**********************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //**** コントロールのインスタンスを取得 ****//
        // [SubForm01へ遷移]ボタン
        m_btnSubForm01 = (Button)findViewById(R.id.btnSubForm01);

        // [SubForm02へ遷移]ボタン
        m_btnSubForm02 = (Button)findViewById(R.id.btnSubForm02);

        //**** コントロールにイベントリスナーを設定 ****//
        // [SubForm01へ遷移]ボタン
        m_btnSubForm01.setOnClickListener(onClick_btnSubForm01);

        // [SubForm02へ遷移]ボタン
        m_btnSubForm02.setOnClickListener(onClick_btnSubForm02);

        //**** 初期処理 ****//
    }
}
