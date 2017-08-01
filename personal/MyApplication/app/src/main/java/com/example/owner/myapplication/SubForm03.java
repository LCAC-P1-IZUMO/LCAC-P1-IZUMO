package com.example.owner.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class SubForm03 extends Activity {
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
     * [クリア]ボタン
     */
    private Button m_btnClear;
    /**
     * [検索]ボタン
     */
    private Button m_btnSearch;
    /**
     * [登録]ボタン
     */
    private Button m_btnRegist;
    /**
     * [数値項目]テキストボックス
     */
    private EditText m_txtNumber;
    /**
     * [文字項目]テキストボックス
     */
    private EditText m_txtCharacter;
    /**
     * [結果一覧]グリッドビュー
     */
    private GridView m_grdResults;

    //**********************************************************
    //******************  イベントリスナー  ********************
    //**********************************************************
    /**
     * [クリア]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnClear = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            m_txtNumber.setText("");
            m_txtCharacter.setText("");
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
        setContentView(R.layout.sub_form03);

        //**** コントロールのインスタンスを取得 ****//
        // [クリア]ボタン
        m_btnClear = (Button)findViewById(R.id.btnClear);

        // [検索]ボタン
        m_btnSearch = (Button)findViewById(R.id.btnSearch);

        // [登録]ボタン
        m_btnRegist = (Button)findViewById(R.id.btnRegist);

        // [数値項目]テキストボックス
        m_txtNumber = (EditText)findViewById(R.id.txtNumber);

        // [文字項目]テキストボックス
        m_txtCharacter = (EditText)findViewById(R.id.txtCharacter);

        // [結果一覧]グリッドビュー
        m_grdResults = (GridView)findViewById(R.id.grdResults);

        //**** コントロールにイベントリスナーを設定 ****//
        // [クリア]ボタン
        m_btnClear.setOnClickListener(onClick_btnClear);

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
                Toast.makeText(this, "タスクを削除して終了！", Toast.LENGTH_SHORT).show();
                // タスクを削除して終了
                finishAndRemoveTask();
            }
        }
        return true;
    }
}