package com.example.oooooon.temperatureapp;

/**
 * Created by OooOoOn on 27/03/2017.
 */

public class Converter {


    public static float convertFahrenheitToCelcius(float fahrenheit) {
        return ((fahrenheit-32) * 5/9);
    }

    public static float convertCelciusToFahrenheit(float celcius){
        return ((celcius * 9)/5) + 32;
    }
}
