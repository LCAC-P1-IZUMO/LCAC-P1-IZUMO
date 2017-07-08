package com.example.owner.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubForm02 extends Activity {
    //**************************//
    //****** コントロール ******//
    //**************************//
    /**
     * [前画面に戻る]ボタン
     */
    private Button mBtnReturn;

    //**************************//
    //**** イベントリスナー ****//
    //**************************//
    /**
     * [前画面に戻る]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener mOnClick_btnReturn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 閉じる
            finishAndRemoveTask();
        }
    };

    //**************************//
    //******** onCreate ********//
    //**************************//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_form02);

        // [前画面に戻る]ボタンのインスタンスを取得
        mBtnReturn = (Button)findViewById(R.id.btnReturn);

        // [前画面に戻る]ボタンを押下した時の処理を設定
        mBtnReturn.setOnClickListener(mOnClick_btnReturn);
    }
}