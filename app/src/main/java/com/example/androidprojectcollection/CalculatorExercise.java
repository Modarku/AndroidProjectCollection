package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidprojectcollection.classes.Calculator;
import com.example.androidprojectcollection.databinding.ActivityCalculatorExerciseBinding;

public class CalculatorExercise extends AppCompatActivity {

    private ActivityCalculatorExerciseBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculatorExerciseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Calculator calc = new Calculator();

        final boolean[] canAutoCalculate = {false};
        final boolean[] hasDecimal = {false};

        binding.btnBack0.setOnClickListener(view -> finish());

        binding.btn0.setOnClickListener(view -> {
            binding.txtValue1.append("0");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn1.setOnClickListener(view -> {
            binding.txtValue1.append("1");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn2.setOnClickListener(view -> {
            binding.txtValue1.append("2");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn3.setOnClickListener(view -> {
            binding.txtValue1.append("3");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn4.setOnClickListener(view -> {
            binding.txtValue1.append("4");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn5.setOnClickListener(view -> {
            binding.txtValue1.append("5");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn6.setOnClickListener(view -> {
            binding.txtValue1.append("6");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn7.setOnClickListener(view -> {
            binding.txtValue1.append("7");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn8.setOnClickListener(view -> {
            binding.txtValue1.append("8");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btn9.setOnClickListener(view -> {
            binding.txtValue1.append("9");
            if(canAutoCalculate[0]){
                calc.autoCalculate(binding.txtValue1.getText().toString());
            }
        });

        binding.btnDecimal.setOnClickListener(view -> {
            //if pressed first
            if(binding.txtValue1.length() == 0){
                binding.txtValue1.append("0.");
                hasDecimal[0] = true;
                return;
            }

            //gets the last character of the binding.txtValue1 TextView
            char checker = binding.txtValue1.getText().toString().charAt(binding.txtValue1.length()-1);

            if(checker == '.'){
                //removes decimal
                hasDecimal[0] = false;
                binding.txtValue1.setText(binding.txtValue1.getText().toString().substring(0, binding.txtValue1.length()-1));
            }else if(!hasDecimal[0]){
                hasDecimal[0] = true;
                binding.txtValue1.append(".");
            }
        });

        binding.btnPlus.setOnClickListener(view -> {
            String currVal = binding.txtValue1.getText().toString();
            binding.txtValue1.setText(operationReplacement(currVal, "+"));

            hasDecimal[0] = false;
            canAutoCalculate[0] = true;

            binding.txtResult.setText(calc.autoCalculate(binding.txtValue1.getText().toString()));
        });

        binding.btnMinus.setOnClickListener(view -> {
            String currVal = binding.txtValue1.getText().toString();
            binding.txtValue1.setText(operationReplacement(currVal, "-"));

            hasDecimal[0] = false;
            canAutoCalculate[0] = true;

            binding.txtResult.setText(calc.autoCalculate(binding.txtValue1.getText().toString()));
        });

        binding.btnMult.setOnClickListener(view -> {
            String currVal = binding.txtValue1.getText().toString();
            binding.txtValue1.setText(operationReplacement(currVal, "*"));

            hasDecimal[0] = false;
            canAutoCalculate[0] = true;

            binding.txtResult.setText(calc.autoCalculate(binding.txtValue1.getText().toString()));
        });

        binding.btnDiv.setOnClickListener(view -> {
            String currVal = binding.txtValue1.getText().toString();
            binding.txtValue1.setText(operationReplacement(currVal, "/"));

            hasDecimal[0] = false;
            canAutoCalculate[0] = true;

            binding.txtResult.setText(calc.autoCalculate(binding.txtValue1.getText().toString()));
        });

        binding.btnCancel.setOnClickListener(view -> {
            binding.txtValue1.setText("");

            canAutoCalculate[0] = false;
            hasDecimal[0] = false;
        });

        binding.btnEquals.setOnClickListener(view -> {
            binding.txtResult.setText(calc.mdasCalculate(binding.txtValue1.getText().toString()));

            canAutoCalculate[0] = false;
            hasDecimal[0] = false;

            System.out.println("equals");
        });

    }

    String operationReplacement(String currVal, String operator){
        //reserves a string where the last operator was already cut and the new operator was added
        String s = currVal.substring(0, currVal.length()-1) + operator;
        if(currVal.endsWith("+") ||
                currVal.endsWith("-") ||
                currVal.endsWith("*") ||
                currVal.endsWith("/")){
            currVal = s;
        }else{
            currVal += operator;
        }
        return currVal;
    }
}