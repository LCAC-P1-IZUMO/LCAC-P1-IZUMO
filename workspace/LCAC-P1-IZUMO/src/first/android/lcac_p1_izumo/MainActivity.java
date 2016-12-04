package first.android.lcac_p1_izumo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;


public class MainActivity<ListView> extends Activity {
    @SuppressWarnings("unchecked")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンのオブジェクトを取得
//        Button btn = (Button)findViewById(R.id.btnScreenTransition);
//        setOnClickListener(new OnClickListener()

        ((Button)findViewById(R.id.btnScreenTransition)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
    			System.out.println("「シナリオ作成画面へ」押下");
            }
        });
        ((Button)findViewById(R.id.btnRestore)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
    			System.out.println("「操作をひとつ戻す」押下");
            }
        });
        ((Button)findViewById(R.id.btnScenarioAdd)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
    			System.out.println("「シナリオ追加」押下");
            }
        });
        ((Button)findViewById(R.id.btnCommandAdd)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
    			System.out.println("「指令追加」押下");
            }
        });
        ((Button)findViewById(R.id.btnScenarioDel)).setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
    			System.out.println("「シナリオ削除」押下");
            }
        });

//		ListView ScenarioListView = (ListView)findViewById(R.id.ScenarioListView);

		// データを準備
		ArrayList<String> items1 = new ArrayList<String>();
		for(int i = 0; i < 20; i++) {
			items1.add("シナリオ-" + i);
		}
		// Adapter - ArrayAdapter
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				this,
				R.layout.scenario_list,
				items1
				);
		// ScenarioListViewに表示
		((ListView)findViewById(R.id.ScenarioListView)).setAdapter(adapter);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
