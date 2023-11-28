package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String input = "";
    private boolean isNewInput = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }
    public void onButtonClick(View view){
        if(isNewInput){
            textView.setText("");
            isNewInput=false;
        }
        Button button = (Button) view;
        String buttonText = button.getText().toString();

        if (input.length() < 10) {
            input += buttonText;
            textView.append(buttonText);
        }
    }
        public void onEqualsClick(View view){
            try{
                double result=evaluarExpresion(input);
                textView.setText(String.valueOf(result));
                input=String.valueOf(result);
                isNewInput=true;
            }catch(Exception e){
                textView.setText("Error");
                isNewInput=true;
            }
        }
        public void onClearClick(View view){
            textView.setText((""));
            input="";
            isNewInput=true;
        }
        private double evaluarExpresion(String expresion) {
return 0;
        }

    }