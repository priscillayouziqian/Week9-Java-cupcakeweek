import java.util.*;

public class Animal {
    private String name;
    private int brain;
    private int body;

    public Animal(String name, int brain, int body) {
        this.name = name;
        this.brain = brain;
        this.body = body;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }
}
