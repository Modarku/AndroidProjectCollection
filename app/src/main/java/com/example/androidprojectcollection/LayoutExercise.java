package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_exercise);

        Button buttBack = (Button) findViewById(R.id.btnBack);

        buttBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityBack();
            }
        });
    }

    public void ActivityBack(){
        Intent intent = new Intent(LayoutExercise.this, MainActivity.class);
        startActivity(intent);
    }


}