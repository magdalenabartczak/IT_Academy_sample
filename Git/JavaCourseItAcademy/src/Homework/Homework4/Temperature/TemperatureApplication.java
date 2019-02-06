package Homework.Homework4.Temperature;

import java.util.Scanner;

// 3) Convert the user-entered temperature from Celsius to Farenheit.
// create another class TemperatureApplication with method main,
// and use your class Temperature in the body of main method.

public class TemperatureApplication {
    public static void main(String[] args) {
        System.out.println("Please type temperature in Celcius ");
        Scanner scanner = new Scanner(System.in);
        double temperatureInCelsius = scanner.nextDouble();

        Temperature temperature = new Temperature(temperatureInCelsius);
        temperature.convertToFarenheit(temperatureInCelsius);

        System.out.println("Temperature in Farentheits = " + temperature.convertToFarenheit(temperatureInCelsius));
    }
}
