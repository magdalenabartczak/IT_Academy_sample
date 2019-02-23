package Lessons.Lesson9;
   /*
    Abstraction - podobne do polimorfizmu, możemy mieć tyle typów personów ile chcemy,
    ale dla metod, które działają z personą nie musimy się martwić, z którą osobą pracują

    Klasy abstrakcyjne - mogą mieć nie zaimplementowane metody

    Klasa abstrakcyjna NIE MOZE być final

    reason for abstract class - if you know that your entity should provide functionality,
    but you don't know how/ want to implement it
    generalizuje hierarchię klas
     */

public abstract class AbstractPerson {
    protected String lastName;

 //   this.lastName = lastName
// konstruktor


    public AbstractPerson(String lastName) {
    }

    public abstract void printName();       //don't provide any method here

//    public void printLastName {
//        System.out.println(lastName);
//
    }


