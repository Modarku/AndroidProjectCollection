package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.androidprojectcollection.databinding.ActivityPassingIntentsExercise2Binding;

public class PassingIntentsExercise2 extends AppCompatActivity {
    private ActivityPassingIntentsExercise2Binding binding;
    private String fname;
    private String lname;
    private String birthdate;
    private String birthplace;
    private String email;
    private String parent1fname;
    private String parent1lname;
    private String parent2fname;
    private String parent2lname;
    private String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPassingIntentsExercise2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pi2BtnBack.setOnClickListener(v -> finish());

        Intent intent = getIntent();

        fname = intent.getStringExtra("fname_key");
        lname = intent.getStringExtra("lname_key");
        birthdate = intent.getStringExtra("birthdate_key");
        birthplace = intent.getStringExtra("birthplace_key");
        email = intent.getStringExtra("email_key");
        parent1fname = intent.getStringExtra("parent1fname_key");
        parent1lname = intent.getStringExtra("parent1lname_key");
        parent2fname = intent.getStringExtra("parent2fname_key");
        parent2lname = intent.getStringExtra("parent2lname_key");
        gender = intent.getStringExtra("gender_key");

        binding.pi2InptNameFirst.setText(fname);
        binding.pi2InptNameLast.setText(lname);
        binding.pi2InptBirthDate.setText(birthdate);
        binding.pi2InptBirthPlace.setText(birthplace);
        binding.pi2InptEmail.setText(email);
        binding.pi2InptParent1NameFirst.setText(parent1fname);
        binding.pi2InptParent1NameLast.setText(parent1lname);
        binding.pi2InptParent2NameFirst.setText(parent2fname);
        binding.pi2InptParent2NameLast.setText(parent2lname);
        binding.pi2InptGender.setText(gender);

    }
}