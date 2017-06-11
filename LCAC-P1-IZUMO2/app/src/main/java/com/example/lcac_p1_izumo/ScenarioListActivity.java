package com.example.lcac_p1_izumo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScenarioListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_list);

        //「シナリオ作成画面へ」ボタン押下
        ((Button)findViewById(R.id.btnScreenTransition)).setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                System.out.println("「シナリオ作成画面へ」押下");
            }
        });

        //「操作を一つ戻す」ボタン押下
        ((Button)findViewById(R.id.btnRestore)).setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                System.out.println("「操作を一つ戻す」押下");
            }
        });

        //「シナリオ追加」ボタン押下
        ((Button)findViewById(R.id.btnScenarioAdd)).setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                System.out.println("「シナリオ追加」押下");
            }
        });

        //「指令追加」ボタン押下
        ((Button)findViewById(R.id.btnCommandAdd)).setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                System.out.println("「指令追加」押下");
            }
        });

        //「シナリオ削除」ボタン押下
        ((Button)findViewById(R.id.btnScenarioDel)).setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                System.out.println("「シナリオ削除」押下");
            }
        });

        //「指令削除」ボタン押下
        ((Button)findViewById(R.id.btnCommandDel)).setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                System.out.println("「指令削除」押下");
            }
        });
    }
}
