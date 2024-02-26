package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ButtonExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);
        final boolean[] isDarkMode = {false};

        Button buttBack = (Button) findViewById(R.id.btnBackMenu);
        Button buttDisappear = (Button) findViewById(R.id.btnDisappear);
        Button buttToast = (Button) findViewById(R.id.btnToast);
        Button buttOpenActivity = (Button) findViewById(R.id.btnChangeButttonBG);
        Button buttChangeButtonColor = (Button) findViewById(R.id.btnChangeButttonBG);
        Button buttChangeAppColor = (Button) findViewById(R.id.btnChangeBG);

        buttBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenMenu();
            }
        });

        buttDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttDisappear.setVisibility(View.GONE);
            }
        });

        buttToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ButtonExercise.this, "I'M GONNA TOAAAASSSTTTT",Toast.LENGTH_LONG).show();
            }
        });

        buttOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Nothing yet");
            }
        });

        buttChangeButtonColor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttChangeButtonColor.setBackgroundColor(Color.parseColor("#7077A1"));
            }
        });

        buttChangeAppColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isDarkMode[0]) {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                    isDarkMode[0] = false;
                }
                else {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#2D3250"));
                    isDarkMode[0] = true;
                }
            }
        });
    }

    public void OpenMenu(){
        Intent intent = new Intent(ButtonExercise.this, MainActivity.class);
        startActivity(intent);
    }
}