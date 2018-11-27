package com.othello.test.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.othello.test.R;
import com.othello.test.model.Board;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Board board = new Board();

    }
}
