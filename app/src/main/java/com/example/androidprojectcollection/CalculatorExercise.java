package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);
        final boolean[] isValue1 = {false};
        final boolean[] isOperand = {false};
        final boolean[] isValue2 = {false};

        TextView value1 = (TextView) findViewById(R.id.txtValue1);
        TextView value2 = (TextView) findViewById(R.id.txtValue2);
        TextView operand = (TextView) findViewById(R.id.txtOperand);
        TextView result = (TextView) findViewById(R.id.txtResult);

        Button buttBack = (Button) findViewById(R.id.btnBack0);
        Button butt0 = (Button) findViewById(R.id.btn0);
        Button butt1 = (Button) findViewById(R.id.btn1);
        Button butt2 = (Button) findViewById(R.id.btn2);
        Button butt3 = (Button) findViewById(R.id.btn3);
        Button butt4 = (Button) findViewById(R.id.btn4);
        Button butt5 = (Button) findViewById(R.id.btn5);
        Button butt6 = (Button) findViewById(R.id.btn6);
        Button butt7 = (Button) findViewById(R.id.btn7);
        Button butt8 = (Button) findViewById(R.id.btn8);
        Button butt9 = (Button) findViewById(R.id.btn9);
        Button buttPlus = (Button) findViewById(R.id.btnPlus);
        Button buttMinus = (Button) findViewById(R.id.btnMinus);
        Button buttMult = (Button) findViewById(R.id.btnMult);
        Button buttDiv = (Button) findViewById(R.id.btnDiv);
        Button buttEquals = (Button) findViewById(R.id.btnEquals);
        Button buttCancel = (Button) findViewById(R.id.btnCancel);

        buttBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenMenu();
            }
        });

        butt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("0");
                    isValue1[0] = true;
                }else{
                    value2.append("0");
                    isValue2[0] = true;
                }
            }
        });

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("1");
                    isValue1[0] = true;
                }else{
                    value2.append("1");
                    isValue2[0] = true;
                }
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("2");
                    isValue1[0] = true;
                }else{
                    value2.append("2");
                    isValue2[0] = true;
                }
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("3");
                    isValue1[0] = true;
                }else{
                    value2.append("3");
                    isValue2[0] = true;
                }
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("4");
                    isValue1[0] = true;
                }else{
                    value2.append("4");
                    isValue2[0] = true;
                }
            }
        });

        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("5");
                    isValue1[0] = true;
                }else{
                    value2.append("5");
                    isValue2[0] = true;
                }
            }
        });

        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("6");
                    isValue1[0] = true;
                }else{
                    value2.append("6");
                    isValue2[0] = true;
                }
            }
        });

        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("7");
                    isValue1[0] = true;
                }else{
                    value2.append("7");
                    isValue2[0] = true;
                }
            }
        });

        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("8");
                    isValue1[0] = true;
                }else{
                    value2.append("8");
                    isValue2[0] = true;
                }
            }
        });

        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOperand[0]){
                    value1.append("9");
                    isValue1[0] = true;
                }else{
                    value2.append("9");
                    isValue2[0] = true;
                }
            }
        });

        buttPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOperand[0] = true;
                operand.setText("+");
            }
        });

        buttMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOperand[0] = true;
                operand.setText("-");
            }
        });

        buttMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOperand[0] = true;
                operand.setText("x");
            }
        });

        buttDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOperand[0] = true;
                operand.setText("/");
            }
        });

        buttCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOperand[0] = false;
                operand.setText("");
                isValue1[0] = false;
                value1.setText("");
                isValue2[0] = false;
                value2.setText("");
            }
        });

        buttEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(value1.getText().toString());
                double b = Double.parseDouble(value2.getText().toString());
                double c;
                String oper = operand.getText().toString();
                char operChar = oper.charAt(0);

                switch(operChar){
                    case '+':
                        c = a + b;
                        result.setText("" + c);
                        break;
                    case '-':
                        c = a - b;
                        result.setText("" + c);
                        break;
                    case '*':
                        c = a * b;
                        result.setText("" + c);
                        break;
                    case '/':
                        c = a / b;
                        result.setText("" + c);
                        break;
                }
                isOperand[0] = false;
                operand.setText("");
                isValue1[0] = false;
                value1.setText("");
                isValue2[0] = false;
                value2.setText("");
            }
        });

    }

    public void OpenMenu(){
        Intent intent = new Intent(CalculatorExercise.this, MainActivity.class);
        startActivity(intent);
    }
}