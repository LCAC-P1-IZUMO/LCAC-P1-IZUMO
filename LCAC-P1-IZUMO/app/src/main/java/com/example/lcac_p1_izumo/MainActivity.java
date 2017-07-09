package com.example.lcac_p1_izumo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
            // [SubForm01]を開く
            Intent intent = new Intent(getApplication(), print_instructions.class);
            startActivity(intent);
        }
    };
    /**
     * [Kikuchi]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener mOnClick_btn_kikuchi = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [SubForm02]を開く
            Intent intent = new Intent(getApplication(), groupcreationscreen.class);
            startActivity(intent);
        }
    };
    /**
     * [Kanazawa]ボタンを押下した時の処理を定義
     */
    private Button.OnClickListener mOnClick_btn_kanazawa = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            // [SubForm02]を開く
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

        // [SubForm01へ遷移]ボタンのインスタンスを取得
        mBtn_kondo = (Button)findViewById(R.id.btn_kondo);

        // [SubForm01へ遷移]ボタンを押下した時の処理を設定
        mBtn_kondo.setOnClickListener(mOnClick_btn_kondo);

        // [SubForm02へ遷移]ボタンのインスタンスを取得
        mBtn_kikuchi = (Button)findViewById(R.id.btn_kikuchi);

        // [SubForm02へ遷移]ボタンを押下した時の処理を設定
        mBtn_kikuchi.setOnClickListener(mOnClick_btn_kikuchi);

        // [SubForm01へ遷移]ボタンのインスタンスを取得
        mBtn_kanazawa = (Button)findViewById(R.id.btn_kanazawa);

        // [SubForm01へ遷移]ボタンを押下した時の処理を設定
        mBtn_kanazawa.setOnClickListener(mOnClick_btn_kanazawa);

    }
}
