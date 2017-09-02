package com.example.lcac_p1_izumo;

import android.app.Activity;
import android.content.Intent;
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

    /** [前画面に戻る]ボタン */
    private Button mBtnReturn;

    /** [グループ編集]ボタン */
    private Button m_btnGroupEdit;

    /** [イベント編集]ボタン */
    private Button m_btnEventEdit;

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
    /**
     * [グループ編集]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnGroupEdit = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [グループ編集]を開く
            Intent intent = new Intent(getApplication(), GroupCreationScreen.class);
            startActivity(intent);
        }
    };
    /**
     * [イベント編集]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener onClick_btnEventEdit = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [イベント編集]を開く
            Intent intent = new Intent(getApplication(), ScenarioListActivity.class);
            startActivity(intent);
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

        // [グループ編集]ボタン
        m_btnGroupEdit = (Button)findViewById(R.id.btnGroupEdit);
        m_btnGroupEdit.setOnClickListener(onClick_btnGroupEdit);

        // [イベント編集]ボタン
        m_btnEventEdit = (Button)findViewById(R.id.btnEventEdit);
        m_btnEventEdit.setOnClickListener(onClick_btnEventEdit);
    }

}