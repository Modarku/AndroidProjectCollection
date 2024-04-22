package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {

    ImageButton btnChanger;
    String message = "Click the triple dot to change my appearance!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.mBtnTransformingBtn);
        btnChanger.setOnClickListener(v -> Toast.makeText(MenuExercise.this, message, Toast.LENGTH_LONG).show());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_choice_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.mItemSquare:
                btnChanger.setImageResource(R.drawable.m_squarebtn);
                message = "The classic in 90s website GUI!";
                break;
            case R.id.mItemColor:
                btnChanger.setImageResource(R.drawable.m_ovalbtn);
                message = "I'm a cirrrrccccccllle";
                break;
            case R.id.mItemVanish:
                btnChanger.setImageResource(0);
                message = "BOOO!!";
                break;
            case R.id.mItemCracked:
                btnChanger.setImageResource(R.drawable.m_crackedbtn);;
                message = "DID YOU JUST BREAK UP WITH ME???";
                break;
            case R.id.mItemPrisoner:
                btnChanger.setImageResource(R.drawable.prof4);
                message = "39 buried. 0 found.";
                break;
            case R.id.mItemReset:
                btnChanger.setImageResource(R.drawable.m_roundedbtn);
                message = "Back to the start: The modern button";
                break;
            case R.id.mItemExit:
                finish();
                break;
        }
        return true;
    }
}