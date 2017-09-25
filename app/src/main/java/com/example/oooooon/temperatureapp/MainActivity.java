package com.example.oooooon.temperatureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.inputValue);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.button1:
                RadioButton celciusButton = (RadioButton) findViewById(R.id.radioButton);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radioButton2);

                float inputValue = Float.parseFloat(text.getText().toString());
                if(celciusButton.isChecked()){
                    text.setText(String.valueOf(Converter.convertFahrenheitToCelcius(inputValue)));
                    celciusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                }
                else{
                    text.setText(String.valueOf(Converter.convertCelciusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celciusButton.setChecked(true);

                }

                break;


        }
    }

    public void ifClick(View view){
        text.setText("");
    }
}
