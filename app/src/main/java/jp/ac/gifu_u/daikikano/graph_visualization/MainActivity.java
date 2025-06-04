package jp.ac.gifu_u.daikikano.graph_visualization;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mode = 0; // 0: 初期状態, 1: 最短路, 2: Union-Find

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //モードの取得
        Intent intent = getIntent();
        mode = intent.getIntExtra("mode",0);

        //modeによって画面推移
        switch (mode){
            case 1:
                Intent next_intent = new Intent(this,SelectActivity.class);
                startActivity(next_intent);
                finish();
                break;
            case 2:
                next_intent = new Intent(this,ShortestPathActivity.class);
                startActivity(next_intent);
                finish();
                break;
            default:
                // 最初に起動された場合はSelectActivityへ
                next_intent = new Intent(this, SelectActivity.class)
                startActivity(next_intent);
                finish();
                break;
        }



    }
}

