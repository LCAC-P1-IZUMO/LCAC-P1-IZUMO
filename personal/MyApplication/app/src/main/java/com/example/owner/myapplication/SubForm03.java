package com.example.owner.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
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

    //**********************************************************
    //******************  イベントリスナー  ********************
    //**********************************************************

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

        //**** コントロールにイベントリスナーを設定 ****//

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