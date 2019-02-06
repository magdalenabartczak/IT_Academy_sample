package Homework.Homework4.Temperature;

//3) Convert the user-entered temperature from Celsius to Farenheit.
// formula to convert C to F:
// temperatureInFarenheihts = (temperatureInCelsius * 9 / 5) + 32
// temperature can be provided with decimal points, for example 1.2 or 29.5.
// So use floating point type (float or double).

// create a class Temperature. Create a field for a celsius temperature.
// Initialize this field in a constructor.
// Create method convertToFarenheit() which should return temperature value in Farenheit.

public class Temperature {

    private double temperatureInCelsius; //create field

    public Temperature(double grade) {  // constructor
        temperatureInCelsius = grade;
    }


    public double convertToFarenheit(double temperatureInFarenheihts) {
        temperatureInFarenheihts = ((temperatureInCelsius * 9.0) / 5.0) + 32.0;
        return temperatureInFarenheihts;
    }
}
