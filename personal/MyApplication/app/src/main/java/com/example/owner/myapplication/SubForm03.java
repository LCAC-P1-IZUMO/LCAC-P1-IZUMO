package com.example.owner.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteCursor;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import DataBase.DataBase;
import DataBase.Table01;

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
    /**
     * [検索]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnSearch = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // データベースヘルパーのインスタンスを作成する
            DataBase dbHelper = new DataBase(SubForm03.this);
            // SQLiteのインスタンスを取得する
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            // 検索
            SQLiteCursor cursor = Table01.sqlSelectAllColumns(db, true,
                    m_txtNumber.getText().toString(),
                    m_txtCharacter.getText().toString()
            );

            // 結果を格納
            ArrayList<String> list = new ArrayList<String>();
            //for (int row = 0; row < cursor.getCount(); ++row) {
            //    list.add(cursor.getString(0) + " " + cursor.getString(1));
            //    cursor.moveToNext();
            //}

            //// 結果を表示
            //ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            //        getApplicationContext(),
            //        android.R.layout.simple_list_item_1,
            //        list
            //);
            //m_grdResults.setAdapter(adapter);

            Toast.makeText(
                    SubForm03.this,
                    String.valueOf(cursor.getCount()) + "件取得",
                    Toast.LENGTH_SHORT
            ).show();

            // データベースを閉じる  
            db.close();
        }
    };
    /**
     * [登録]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnRegist = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // データベースヘルパーのインスタンスを作成する
            DataBase dbHelper = new DataBase(SubForm03.this);
            // SQLiteのインスタンスを取得する
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            // データの登録・更新
            Table01.sqlRegist(
                    db,
                    true,
                    m_txtNumber.getText().toString(),
                    m_txtCharacter.getText().toString()
            );

            // データベースを閉じる  
            db.close();
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

        // [検索]ボタン
        m_btnSearch.setOnClickListener(onClick_btnSearch);

        // [登録]ボタン
        m_btnRegist.setOnClickListener(onClick_btnRegist);

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