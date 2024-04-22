package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TicTacToeMidterm extends AppCompatActivity {

    boolean gameState = false; //false = player1, true player2
    boolean isGameFinished = false;
    int ctr = 0;
    LinearLayout llv_gameBoard;
    TextView tv_gameState;
    Button btn_cell0;
    Button btn_cell1;
    Button btn_cell2;
    Button btn_cell3;
    Button btn_cell4;
    Button btn_cell5;
    Button btn_cell6;
    Button btn_cell7;
    Button btn_cell8;
    Button btn_quit;
    Button btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe_midterm);
        tv_gameState = findViewById(R.id.tv_gameState);
        llv_gameBoard = findViewById(R.id.llv_gameBoard);
        btn_cell0 = findViewById(R.id.btn_cell0);
        btn_cell1 = findViewById(R.id.btn_cell1);
        btn_cell2 = findViewById(R.id.btn_cell2);
        btn_cell3 = findViewById(R.id.btn_cell3);
        btn_cell4 = findViewById(R.id.btn_cell4);
        btn_cell5 = findViewById(R.id.btn_cell5);
        btn_cell6 = findViewById(R.id.btn_cell6);
        btn_cell7 = findViewById(R.id.btn_cell7);
        btn_cell8 = findViewById(R.id.btn_cell8);
        btn_quit = findViewById(R.id.btn_quitGame);
        btn_reset = findViewById(R.id.btn_resetGame);

        btn_quit.setOnClickListener(v -> finish());
        btn_reset.setOnClickListener(v -> {
            llv_gameBoard.setBackgroundColor(Color.BLUE);
            gameState = false;
            isGameFinished = false;
            ctr = 0;
            btn_cell0.setClickable(true);
            btn_cell1.setClickable(true);
            btn_cell2.setClickable(true);
            btn_cell3.setClickable(true);
            btn_cell4.setClickable(true);
            btn_cell5.setClickable(true);
            btn_cell6.setClickable(true);
            btn_cell7.setClickable(true);
            btn_cell8.setClickable(true);

            btn_cell0.setText("");
            btn_cell1.setText("");
            btn_cell2.setText("");
            btn_cell3.setText("");
            btn_cell4.setText("");
            btn_cell5.setText("");
            btn_cell6.setText("");
            btn_cell7.setText("");
            btn_cell8.setText("");
        });

        clickButton(btn_cell0);
        clickButton(btn_cell1);
        clickButton(btn_cell2);
        clickButton(btn_cell3);
        clickButton(btn_cell4);
        clickButton(btn_cell5);
        clickButton(btn_cell6);
        clickButton(btn_cell7);
        clickButton(btn_cell8);


    }
    public void clickButton(Button btn){
        btn.setOnClickListener(v -> {
            if(gameState){
                gameState = false;
                tv_gameState.setText(R.string.tv_gamestate_p1turn);
                llv_gameBoard.setBackgroundColor(Color.BLUE);
                btn.setText("X");
            }else{
                gameState = true;
                tv_gameState.setText(R.string.tv_gamestate_p2turn);
                llv_gameBoard.setBackgroundColor(Color.RED);
                btn.setText("O");
            }
            btn.setClickable(false);
            ctr++;
            checkGameState(gameState);
        });
    }
    public void checkGameState(boolean gameState){
        //hi :3
        String[] checkers = new String[3];

        if(ctr >= 9){
            isGameFinished = false;
            tv_gameState.setText(R.string.tv_gamestate_lose);
        }

        checkGameStateRow(checkers, 0);
        checkGameStateRow(checkers, 1);
        checkGameStateRow(checkers, 2);

        checkGameStateCol(checkers, 0);
        checkGameStateCol(checkers, 1);
        checkGameStateCol(checkers, 2);

        checkGameStateDiag(checkers, 0);
        checkGameStateDiag(checkers, 1);


        if(isGameFinished){
            llv_gameBoard.setBackgroundColor(Color.YELLOW);
            btn_cell0.setClickable(false);
            btn_cell1.setClickable(false);
            btn_cell2.setClickable(false);
            btn_cell3.setClickable(false);
            btn_cell4.setClickable(false);
            btn_cell5.setClickable(false);
            btn_cell6.setClickable(false);
            btn_cell7.setClickable(false);
            btn_cell8.setClickable(false);
        }
    }

    public void checker(String[] checkers){
        if(checkers[0].equals("X") && checkers[1].equals("X") && checkers[2].equals("X")){
            tv_gameState.setText(R.string.tv_gamestate_p2win);
            isGameFinished = true;
        }
        if(checkers[0].equals("O") && checkers[1].equals("O") && checkers[2].equals("O")){
            tv_gameState.setText(R.string.tv_gamestate_p1win);
            isGameFinished = true;
        }
    }

    public void checkGameStateRow(String[] checkers, int row) {
        switch(row){
            case 0:
                checkers[0] = btn_cell0.getText().toString();
                checkers[1] = btn_cell1.getText().toString();
                checkers[2] = btn_cell2.getText().toString();
                break;
            case 1:
                checkers[0] = btn_cell3.getText().toString();
                checkers[1] = btn_cell4.getText().toString();
                checkers[2] = btn_cell5.getText().toString();
                break;
            case 2:
                checkers[0] = btn_cell6.getText().toString();
                checkers[1] = btn_cell7.getText().toString();
                checkers[2] = btn_cell8.getText().toString();
                break;
        }
        checker(checkers);
    }

    public void checkGameStateCol(String[] checkers, int row) {
        switch(row){
            case 0:
                checkers[0] = btn_cell0.getText().toString();
                checkers[1] = btn_cell3.getText().toString();
                checkers[2] = btn_cell6.getText().toString();
                break;
            case 1:
                checkers[0] = btn_cell1.getText().toString();
                checkers[1] = btn_cell4.getText().toString();
                checkers[2] = btn_cell7.getText().toString();
                break;
            case 2:
                checkers[0] = btn_cell2.getText().toString();
                checkers[1] = btn_cell5.getText().toString();
                checkers[2] = btn_cell8.getText().toString();
                break;
        }
        checker(checkers);
    }

    public void checkGameStateDiag(String[] checkers, int row) {
        switch(row){
            case 0:
                checkers[0] = btn_cell0.getText().toString();
                checkers[1] = btn_cell4.getText().toString();
                checkers[2] = btn_cell8.getText().toString();
                break;
            case 1:
                checkers[0] = btn_cell2.getText().toString();
                checkers[1] = btn_cell4.getText().toString();
                checkers[2] = btn_cell6.getText().toString();
                break;
        }
        checker(checkers);
    }

}