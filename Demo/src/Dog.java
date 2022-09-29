import java.util.*;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;

    public Dog(String name, int eyes, int legs, int tail) {
        super(name, 1, 1);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override //override a method which in Animal class
    public void eat() {
        System.out.println("Dog.eat() called"); //Dog class 特有的over ride Animal的eat method
        chew(); //method only exist inside dog class
        super.eat(); //Amimal's eat method
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
}
