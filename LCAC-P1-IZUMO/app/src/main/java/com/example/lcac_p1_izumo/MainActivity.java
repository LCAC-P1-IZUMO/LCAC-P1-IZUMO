package com.example.lcac_p1_izumo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/

public class MainActivity extends AppCompatActivity {
    //**************************//
    //****** コントロール ******//
    //**************************//
    /**
     * [Kondo]ボタン
     */
    private Button mBtn_kondo;
    /**
     * [Kikuchi]ボタン
     */
    private Button mBtn_kikuchi;
    /**
     * [Kanazawa]ボタン
     */
    private Button mBtn_kanazawa;

    //**************************//
    //**** イベントリスナー ****//
    //**************************//
    /**
     * [Kondo]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener mOnClick_btn_kondo = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [PrintInstructions]を開く
            Intent intent = new Intent(getApplication(), PrintInstructions.class);
            startActivity(intent);
        }
    };
    /**
     * [Kikuchi]ボタンを押下した時の処理を定義
     */
//    private Button.OnClickListener mOnClick_btn_kikuchi = new Button.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            // [Kikuchi]を開く
//            Intent intent = new Intent(getApplication(), groupcreationscreen.class);
//            startActivity(intent);
//        }
//    };
    /**
     * [Kanazawa]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener mOnClick_btn_kanazawa = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [Kanazawa]を開く
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
        setContentView(R.layout.activity_main);

        // [kondoへ遷移]ボタンのインスタンスを取得
        mBtn_kondo = (Button) findViewById(R.id.btn_kondo);

        // [kondoへ遷移]ボタンを押下した時の処理を設定
        mBtn_kondo.setOnClickListener(mOnClick_btn_kondo);

        // [Kikuchiへ遷移]ボタンのインスタンスを取得
        mBtn_kikuchi = (Button) findViewById(R.id.btn_kikuchi);

//        // [Kikuchiへ遷移]ボタンを押下した時の処理を設定
//        mBtn_kikuchi.setOnClickListener(mOnClick_btn_kikuchi);

        // [kanazawaへ遷移]ボタンのインスタンスを取得
        mBtn_kanazawa = (Button) findViewById(R.id.btn_kanazawa);

        // [kanazawaへ遷移]ボタンを押下した時の処理を設定
        mBtn_kanazawa.setOnClickListener(mOnClick_btn_kanazawa);

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
