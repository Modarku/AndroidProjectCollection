package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.androidprojectcollection.databinding.ActivityButtonExerciseBinding;

public class ButtonExercise extends AppCompatActivity {

    private ActivityButtonExerciseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityButtonExerciseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final boolean[] isDarkMode = {false};

        binding.btnBackMenu.setOnClickListener(view -> finish());

        binding.btnDisappear.setOnClickListener(view -> binding.btnDisappear.setVisibility(View.GONE));

        binding.btnToast.setOnClickListener(view -> Toast.makeText(ButtonExercise.this, "I'M GONNA TOAAAASSSTTTT",Toast.LENGTH_LONG).show());

        binding.btnChangeButttonBG.setOnClickListener(view -> binding.btnChangeButttonBG.setBackgroundColor(Color.parseColor("#7077A1")));

        binding.btnChangeBG.setOnClickListener(view ->  {
            if(isDarkMode[0]) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                isDarkMode[0] = false;
            }
            else {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#2D3250"));
                isDarkMode[0] = true;
            }
        });
    }
}