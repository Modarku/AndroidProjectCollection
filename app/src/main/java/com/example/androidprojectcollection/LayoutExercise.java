package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidprojectcollection.databinding.ActivityButtonExerciseBinding;
import com.example.androidprojectcollection.databinding.ActivityLayoutExerciseBinding;

public class LayoutExercise extends AppCompatActivity {

    private ActivityLayoutExerciseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLayoutExerciseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(view -> finish());
    }
}