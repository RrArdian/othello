package com.othello.test.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.othello.test.R;
import com.othello.test.model.Board;
import com.othello.test.model.Player;

public class MainActivity extends AppCompatActivity {

    private Board board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Board board = new Board();
        Toast.makeText(getApplicationContext(), "Initialize game!", Toast.LENGTH_SHORT).show();
    }

    public void onClickCell(View v) {
        Button button = (Button) v;

        String tag = button.getTag().toString();
        int row = Integer.parseInt(tag.substring(0, 1));
        int col = Integer.parseInt(tag.substring(1, 2));

        Player movePlayer = board.mark(row, col);
    }
}
