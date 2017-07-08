package com.example.owner.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    //**************************//
    //****** コントロール ******//
    //**************************//
    /**
     * [SubForm01へ遷移]ボタン
     */
    private Button mBtnSubForm01;
    /**
     * [SubForm02へ遷移]ボタン
     */
    private Button mBtnSubForm02;

    //**************************//
    //**** イベントリスナー ****//
    //**************************//
    /**
     * [SubForm01へ遷移]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener mOnClick_btnSubForm01 = new Button.OnClickListener() {
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
    private Button.OnClickListener mOnClick_btnSubForm02 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [SubForm02]を開く
            Intent intent = new Intent(getApplication(), SubForm02.class);
            startActivity(intent);
        }
    };

    //**************************//
    //******** onCreate ********//
    //**************************//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // [SubForm01へ遷移]ボタンのインスタンスを取得
        mBtnSubForm01 = (Button)findViewById(R.id.btnSubForm01);

        // [SubForm01へ遷移]ボタンを押下した時の処理を設定
        mBtnSubForm01.setOnClickListener(mOnClick_btnSubForm01);

        // [SubForm02へ遷移]ボタンのインスタンスを取得
        mBtnSubForm02 = (Button)findViewById(R.id.btnSubForm02);

        // [SubForm02へ遷移]ボタンを押下した時の処理を設定
        mBtnSubForm02.setOnClickListener(mOnClick_btnSubForm02);
    }
}
