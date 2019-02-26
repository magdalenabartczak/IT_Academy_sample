package Test1.CountingObjects;

public class CountingApp {
    public static void main(String[] args) {
        SomeObjects object1 = new SomeObjects();
        SomeObjects object2 = new SomeObjects();
        SomeObjects object3 = new SomeObjects();
        SomeObjects object4 = new SomeObjects();
        SomeObjects object5 = new SomeObjects();


        System.out.println("Number of objects: " +SomeObjects.countObjects);
    }
}
