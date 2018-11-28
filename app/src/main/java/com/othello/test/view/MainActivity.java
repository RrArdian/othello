package com.othello.test.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.othello.test.R;
import com.othello.test.model.Board;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Board board = new Board();

//        button = findViewById(R.id.btn5);
//        textView = findViewById(R.id.winner);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button.setText("X");
//                textView.setText("O");
//            }
//        });
    }

    public void onClickBtn(View v) {
        button = (Button) v;
        textView = findViewById(R.id.winner);
        String btnTag = (String) button.getTag();
        String row, col;
        col = btnTag.substring(0, 1);
        row = btnTag.substring(1,2);
        button.setText(col + ", " + row);
        textView.setText(col + ", " + row);

        Intent intent = new Intent(this, WinningActivity.class);
        intent.putExtra("data", btnTag);
        startActivity(intent);
    }
}
