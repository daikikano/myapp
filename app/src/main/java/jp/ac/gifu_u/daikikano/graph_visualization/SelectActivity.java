package jp.ac.gifu_u.daikikano.graph_visualization;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SelectActivity extends AppCompatActivity {

    private Button shortestPathButton;
    private Button unionFindButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_select);

        //ボタンの初期化
        shortestPathButton = findViewById(R.id.button_shortest_path);
        unionFindButton = findViewById(R.id.button_union_find);

        shortestPathButton.setOnClickListener(v -> {
            Intent intent = new Intent(SelectActivity.this, MainActivity.class);
            intent.putExtra("mode", 1);  // 最短路
            startActivity(intent);
            finish();
        });

        unionFindButton.setOnClickListener(v -> {
            Intent intent = new Intent(SelectActivity.this, MainActivity.class);
            intent.putExtra("mode", 2);  // Union-Find
            startActivity(intent);
            finish();
        });
    }
}

