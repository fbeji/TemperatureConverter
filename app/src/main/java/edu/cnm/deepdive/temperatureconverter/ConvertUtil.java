package edu.cnm.deepdive.temperatureconverter;

public class ConvertUtil {

    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
      return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
      return ((celsius * 9) / 5) + 32;
    }
      public static float convertCelsiusToKelvin ( float celsius){
        return (float) (celsius + 273.15);


      }
    }

