package Lessons;
/*
Polimorfizm - decyzje, która z metod powinna być wywołana, jak jest kilka metod o tej samej nazwie
Override method -
overloading method - the same name, different parameters -  decyzja, której metody używamy dzieje się podczas kompilacji,
podejmowana jest ona na podstawie parametrów podanych w metodzie.
 */

import Lessons.Lesson9.AbstractPerson;
import Lessons.Lesson9.Client;
import Lessons.Lesson9.Employee;
import Lessons.Lesson9.Person;


public class Lesson10 {
    public static void main(String[] args) {

        AbstractPerson abstractPerson1 = new Person("paul", "smith");
        abstractPerson1.printName();


        Person p1 = new Client("stefan", "burns", 33);
        Person p2 = new Employee("employee", "surname");
        printFullName(p1);
//        p2.printFullName("hi");

        Client c1 = (Client) p2; // ClassCastException - employee cannot be cast to client
        printFullName(c1);


        Client client1 = new Client("Steven", "Grey", 28);
        Person person1 = client1;

        printFullName((Person) client1);

    }


    private static void printFullName(Person p) {
        System.out.println("printing person info");
        p.printFullName();
    }

    private static void printFullName(Client client) {
        System.out.println("printing person info");
        client.printFullName();

    }

//    private void printFullName() {
//        System.out.println(greeting + " ");
//        printFullName();
//    }

    /*
    Abstraction - podobne do polimorfizmu, możemy mieć tyle typów personów ile chcemy,
    ale dla metod, które działają z personą nie musimy się martwić, z którą osobą pracują

    Klasy abstrakcyjne - mogą mieć nie zaimplementowane metody



    Interface - deklaracja - słowo interface zamiast class
    main reason - provide specification for method for implementing classes
    any method implemented in interface is PUBLIC ABSTRACT!!
    nie możemy używać protected ani nic takiego, wszystko co jest dostępne w interfejsie ma być dostępne dla wszystkich

    class Something extends AnotherClass implements InterfaceName......

    standard interfaces of java - poczytać sobie o nich

    interfaces cannot have instance variable
    any variable declared in interface is STATIC FINAL (piszemy ich nazwy wielkimi literami)

    clasa może implementować wiele interfejsów i może ekstendować tylko jedną klasę parent

    composition & relationship
    if sth is part of another class - if one class is a subclass of another class this is relationship
    w kompozycji można mieć wiele relationships

    Ennumerations - special type of class that provides limited values
    Name of enummeration values are all capital letters separated by underscore


Class Object na następną lekcję


     */


}

