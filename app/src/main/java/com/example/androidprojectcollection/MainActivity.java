package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttLayExercise = (Button) findViewById(R.id.btnLayoutExercise);
        Button buttButtExercise = (Button) findViewById(R.id.btnButtonExercise);
        Button buttCalcExercise = (Button) findViewById(R.id.btnOpenCalcu);
        Button buttTicTacMidterm = (Button) findViewById(R.id.btnOpenTicTacToe);
        Button buttConnectExercise = (Button) findViewById(R.id.btnConnectThree);
        Button buttPassingIntents = (Button) findViewById(R.id.btnOpenIntents);
        Button buttFragments = (Button) findViewById(R.id.btnOpenFragments);
        Button buttMenus = (Button) findViewById(R.id.btnOpenMenus);

        buttLayExercise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openLayoutExercise();
            }
        });
        buttButtExercise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openButtonExercise();
            }
        });
        buttCalcExercise.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {openCalcuExercise();}
        });

        buttConnectExercise.setOnClickListener(v -> openConnectThree());

        buttPassingIntents.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PassingIntentsExercise.class)));

        buttTicTacMidterm.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TicTacToeMidterm.class)));

        buttMenus.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MenuExercise.class)));
    }

    public void openLayoutExercise(){
        Intent intent = new Intent(MainActivity.this, LayoutExercise.class);
        startActivity(intent);
    }
    public void openButtonExercise(){
        Intent intent = new Intent(MainActivity.this, ButtonExercise.class);
        startActivity(intent);
    }
    public void openCalcuExercise(){
        Intent intent = new Intent(MainActivity.this, CalculatorExercise.class);
        startActivity(intent);
    }

    public void openConnectThree(){
        Intent intent = new Intent(MainActivity.this, ConnectThreeExercise.class);
        startActivity(intent);
    }

}