package com.example.androidprojectcollection.classes;

import java.util.Collections;
import java.util.Stack;

public class Calculator {
    Stack<Double> operands = new Stack();
    Stack<Character> operators = new Stack();

    public String mdasCalculate(String value) {
        StringBuilder result = new StringBuilder();
        double a, b;

        for(char c : value.toCharArray()){
            if(c == '+' || c == '-' || c == '*' || c == '/'){
                operands.push(Double.valueOf(result.toString()));
                result.delete(0, result.capacity());

                if(!operators.empty() && getOrderPrecedence(operators.peek()) >= getOrderPrecedence(c)){
                    b = operands.pop();
                    a = operands.pop();
                    operands.push(operate(a, b, operators.pop()));
                }

                operators.push(c);
            }else{
                result.append(c);
            }
        }
        try{
            operands.push(Double.valueOf(result.toString()));
        }catch(NumberFormatException e){
            System.err.println("SYNTAX ERROR");
            return "SYNTAX ERROR";
        }

        result.delete(0, result.capacity());

        while(!operators.empty()){
            b = operands.pop();
            a = operands.pop();
            operands.push(operate(a, b, operators.pop()));
        }


        result.append(operands.pop());
        if(result.toString().endsWith(".0")){
            result.delete(result.length()-2, result.length());
        }
        return result.toString();
    }

    public String autoCalculate(String value){
        if(value.endsWith("+") || value.endsWith("-") || value.endsWith("*") || value.endsWith("/")){
            value = value.substring(0, value.length()-1);
        }
        StringBuilder result = new StringBuilder();
        double a, b;

        for(char c : value.toCharArray()){
            if(c == '+' || c == '-' || c == '*' || c == '/'){
                operands.push(Double.valueOf(result.toString()));
                result.delete(0, result.capacity());
                operators.push(c);
            }else{
                result.append(c);
            }
        }
        operands.push(Double.valueOf(result.toString()));
        result.delete(0, result.capacity());

        operators.sort(Collections.reverseOrder());
        reverseOperator();

        while(!operators.empty()){
            b = operands.pop();
            a = operands.pop();
            operands.push(operate(a, b, operators.pop()));
        }
        result.append(operands.pop());
        if(result.toString().endsWith(".0")){
            result.delete(result.length()-2, result.length());
        }
        return result.toString();
    }

    private int getOrderPrecedence(char c) {
        switch (c) {
            case '-':
            case '+':
                return 1;
            case '/':
            case '*':
                return 2;
        }
        return -1;
    }

    private void reverseOperator(){
        Stack<Character> reverse = new Stack<>();
        int size = operators.size();
        for(int i = 0; i < size; i++){
            reverse.push(operators.pop());
        }
        operators = reverse;
    }

    private double operate(double a, double b, char operator) {
        switch(operator){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }
}