package com.othello.test.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.othello.test.R;

public class WinningActivity extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winning);

        String data = getIntent().getExtras().getString("data");

        textView = findViewById(R.id.winnerName);
        textView.setTextSize(50);
        textView.setText("WINNER" + data);
    }
}
