public class TemperatureHelper {

    public static double farenhetiToCelsius (double farenheit){
        return (farenheit - 32) x 5 / 9;
    }
   public static double farenheitToKelvin (double farenheit){
       return ( farenheit - 32) x 5 / 9 + 273,15;
   }
   public static double celciusToFarenheit (double celsius){
        return (celsius x 9 / 5) + 32;
   }
    public static double celciusToKelvin (double celsius){
        return (celsius + 273,15);
    }
    public static double kelvinToFarenheit (doule kelvin){
    return ((farenheit - 32) x 5 / 9 + kelvin)
}
    public static double kelvinToCelsius (double kelvin){
        return ( kelvin - 273,15);

    }
}
/*
Temperature converter
Using TDD create a TemperatureHelper class that allow you to convert temperatures from Fahrenheit,
Celsius or Kelvin (FahrenheitToCelsius, FahrenheitToKelvin, CelsiusToFahrenheit, CelsiusToKelvin,
KelvinToFahrenheit, KelvinToCelsius). Write all tests.
 */