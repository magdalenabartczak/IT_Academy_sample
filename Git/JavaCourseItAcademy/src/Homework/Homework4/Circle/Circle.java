package Homework.Homework4.Circle;
//Define a class Circle, define fields and methods which you think should be in this class.
// Create another class CircleApplication with main method,
// and use class Circle to calculate length of a circle.

//L=2PI*r

public class Circle {

    // create field

    private double radius;

    public Circle(double r) { //constructor
        radius = r;
    }

    public double calculateLength(double circleLenght) {
        double pi = 3.14159;
        circleLenght = 2 * pi * radius;
        return circleLenght;
    }
}

// public double calculateLength(double circleLenght) <- jeżeli tu nie zdeklaruję parametru to
// mogę pominąć konstruktor ten z r
//
// trzeba dać parametry w metodzie tylko jeśli metoda potrzebuje czegoś czego nie ma jeszcze w klasie
//