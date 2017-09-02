package com.example.lcac_p1_izumo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

public class GroupCreationScreen  extends AppCompatActivity {


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
    private Button m_btnClear01;
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
    //******************      onCreate      ********************
    //**********************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groupcreationscreen);

        //**** コントロールのインスタンスを取得 ****//
        // [クリア]ボタン
        m_btnClear01 = (Button)findViewById(R.id.GoupDelete01);

        // [検索]ボタン
        //m_btnSearch = (Button)findViewById(R.id.btnSearch);

        // [登録]ボタン
        //m_btnRegist = (Button)findViewById(R.id.btnRegist);

        // [数値項目]テキストボックス
        //m_txtNumber = (EditText)findViewById(R.id.txtNumber);

        // [文字項目]テキストボックス
        //m_txtCharacter = (EditText)findViewById(R.id.txtCharacter);

        // [結果一覧]グリッドビュー
        //m_grdResults = (GridView)findViewById(R.id.grdResults);

        //**** コントロールにイベントリスナーを設定 ****//
        // [クリア]ボタン
        m_btnClear01.setOnClickListener(onClick_btnClear);

        // [検索]ボタン
        //m_btnSearch.setOnClickListener(onClick_btnSearch);

        //**** 初期処理 ****//
    }


}
