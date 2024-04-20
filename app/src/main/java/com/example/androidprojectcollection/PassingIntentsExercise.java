package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androidprojectcollection.databinding.ActivityPassingIntentsExerciseBinding;

import java.util.ArrayList;

public class PassingIntentsExercise extends AppCompatActivity {
    private ActivityPassingIntentsExerciseBinding binding;
    private String fname;
    private String lname;
    private String birthdate;
    private String birthplace;
    private String email;
    private String parent1fname;
    private String parent1lname;
    private String parent2fname;
    private String parent2lname;
    private String gender = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPassingIntentsExerciseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pi1BtnBack.setOnClickListener(v -> finish());

        binding.pi1BtnClear.setOnClickListener(v -> {
            binding.pi1InptNameFirst.setText("");
            binding.pi1InptNameLast.setText("");
            binding.pi1InptBirthDate.setText("");
            binding.pi1InptBirthPlace.setText("");
            binding.pi1InptEmail.setText("");
            binding.pi1InptParent1NameFirst.setText("");
            binding.pi1InptParent1NameLast.setText("");
            binding.pi1InptParent2NameFirst.setText("");
            binding.pi1InptParent2NameLast.setText("");

            binding.pi1RadioMale.setChecked(false);
            binding.pi1RadioFemale.setChecked(false);
            binding.pi1RadioOther.setChecked(false);
        });

        binding.pi1BtnSubmit.setOnClickListener(v -> {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add(fname = binding.pi1InptNameFirst.getText().toString());
            inputs.add(lname = binding.pi1InptNameLast.getText().toString());
            inputs.add(birthdate = binding.pi1InptBirthDate.getText().toString());
            inputs.add(birthplace = binding.pi1InptBirthPlace.getText().toString());
            inputs.add(email = binding.pi1InptEmail.getText().toString());
            inputs.add(parent1fname = binding.pi1InptParent1NameFirst.getText().toString());
            inputs.add(parent1lname = binding.pi1InptParent1NameLast.getText().toString());
            inputs.add(parent2fname = binding.pi1InptParent2NameFirst.getText().toString());
            inputs.add(parent2lname = binding.pi1InptParent2NameLast.getText().toString());

            if(binding.pi1RadioMale.isChecked()) gender = "Male";
            if(binding.pi1RadioFemale.isChecked()) gender = "Female";
            if(binding.pi1RadioOther.isChecked()) gender = "Others";
            inputs.add(gender);

            for(String str : inputs){
                if(str.isEmpty()) {
                    Toast.makeText(PassingIntentsExercise.this, "Incomplete form", Toast.LENGTH_LONG).show();
                    return;
                }
            }

            Intent puttingExtra = getPuttingExtra();

            startActivity(puttingExtra);
        });
    }

    @NonNull
    private Intent getPuttingExtra() {
        Intent puttingExtra = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
        puttingExtra.putExtra("fname_key", fname);
        puttingExtra.putExtra("lname_key", lname);
        puttingExtra.putExtra("birthdate_key", birthdate);
        puttingExtra.putExtra("birthplace_key", birthplace);
        puttingExtra.putExtra("email_key", email);
        puttingExtra.putExtra("parent1fname_key", parent1fname);
        puttingExtra.putExtra("parent1lname_key", parent1lname);
        puttingExtra.putExtra("parent2fname_key", parent2fname);
        puttingExtra.putExtra("parent2lname_key", parent2lname);
        puttingExtra.putExtra("gender_key", gender);
        return puttingExtra;
    }
}