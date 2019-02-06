package Lessons;

// Punkt x(1,1) w kartezjanskim układzie współrzędnych
// wszystko przed słowem class to modifier -> np public/private/final
// atrybuty klasy - x i y
// możemy użyć tej klasy jako reference data type
// x i y nazywane są fieldami

public class Point {

    private int x;
    private int y;

    public Point () {

    }

    public Point (int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;

    }
// mofifiers, variable_type, variable_name = value
// modifiers can be public, private or protected later will talk about final and synchronised
// you can access public variable from all places with object Point
// private fields can be accessed only from inside of this class - good practise is to give all fields private
// default value of ref data type is null
// class can have behavior - methods
// methods declarations -> modifiers return_type name (parameter list) exceptions{body}
// return type can be primitive type (int, char), reference type or void (nothing)
// parameters - coma separated values


    // jest sugerowane robić modifiersy private i przypisywanie im wartości za pomocą metod
    //  private int x;
    //   private int y;
    public int getX() {
        return x;
    }

    public void move(int newX, int newY) {
        x = newX;
        y = newY;

    }

    public int getY() {
        return y;
    }

}
