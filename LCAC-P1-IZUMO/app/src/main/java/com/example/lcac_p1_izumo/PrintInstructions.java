package com.example.lcac_p1_izumo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by take_ on 2017/07/01.
 */

public class PrintInstructions extends Activity {
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
        setContentView(R.layout.print_instructions);

        // [前画面に戻る]ボタンのインスタンスを取得
        mBtnReturn = (Button)findViewById(R.id.mBtnReturn);

        // [前画面に戻る]ボタンを押下した時の処理を設定
        mBtnReturn.setOnClickListener(mOnClick_btnReturn);
    }
}