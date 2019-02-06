package Lessons;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle() {   // default constructor , no argument constructor

    }

    public Rectangle(Point bottomLeftPoint, Point topRightPoint) { //custom constructor which accepts two parameters
        bottomLeft = bottomLeftPoint;
        topRight = topRightPoint;

    }

    public int calculateArea() {      //metoda zwróci nam powierzchnię, która jest liczbą, dlatego int
        int width = topRight.getX() - bottomLeft.getX();
        int height = topRight.getY() - bottomLeft.getY();


        int area = width * height;


        return area;
    }


}
