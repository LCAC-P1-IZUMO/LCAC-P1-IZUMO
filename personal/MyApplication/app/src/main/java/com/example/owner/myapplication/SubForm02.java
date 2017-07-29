package com.example.owner.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.KeyEvent;

public class SubForm02 extends Activity {
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
     * [名前一覧]リストビュー
     */
    ListView m_lstNames;

    //**********************************************************
    //******************  イベントリスナー  ********************
    //**********************************************************
    /**
     * [名前一覧]リストビュー項目クリック時の処理
     */
    AdapterView.OnItemClickListener onItemSelected_lstNames = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // 値の取得
            String value = (String)parent.getItemAtPosition(position);
            // トースト表示
            Toast.makeText(
                    SubForm02.this,
                    "[" + value + "]が選択された",
                    Toast.LENGTH_SHORT
            ).show();
        }
    };

    //**********************************************************
    //******************      メソッド      ********************
    //**********************************************************
    /**
     * [名前一覧]リストビューに値を設定
     */
    private void setNames() {
        // 適当な値を生成
        String[] names = new String[24];
        for (int i = 0; i < names.length; ++i) {
            names[i] = (i + 1) + "番目さん";
        }

        // リストビューに値を設定
        m_lstNames.setAdapter(new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                names
        ));
    }

    //**********************************************************
    //******************      onCreate      ********************
    //**********************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_form02);

        //**** コントロールのインスタンスを取得 ****//
        // [名前一覧]リストビュー
        m_lstNames = (ListView)findViewById(R.id.lstNames);

        //**** コントロールにイベントリスナーを設定 ****//
        // [名前一覧]リストビュー
        m_lstNames.setOnItemClickListener(onItemSelected_lstNames);

        //**** 初期処理 ****//
        setNames();
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