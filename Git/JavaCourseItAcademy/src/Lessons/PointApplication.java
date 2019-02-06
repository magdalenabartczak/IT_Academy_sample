package Lessons;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);// konstrukltor new i po tym obiekt typu Point zdefiniowany w klasie Point tu stworzyliśmy zmienną point1
        Point point2 = new Point(10,3);


        Rectangle rectangle = new Rectangle(point1, point2);
        int area = rectangle.calculateArea();
        System.out.println("Area = " +area);


//        int x = point1.getX();
//
////        point1.x = 1; // assing value x = 1 to point1
////        point1.y = 1; // assing value y = 1 to point1
//
//
//        System.out.println("wstępne x: " + x);
//
//        point1.move(3, 1);    // zmieniamy pozycję pktu z defaultowego (0,0) na (3,1)
//        x = point1.getX();
//
//        System.out.println("po ruszeniu: " + x);
    }
}
//// debugowanie w intelliJ - poczytać - u mnie F7 nie zadziała :P

//reference data types are represented by classes - class is kind of template to create objects - has the same fields anf set of methods

//method name + list of parameters = method signature
// return statement - za każdym razem kiedy metoda coś zwraca - musi być return!!!! jak jest void to nie powinno się pisać bo jest defaultowo

