public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1);

        Dog dog = new Dog("Ruby", 2,4,1);
        dog.eat();
        dog.walk();
        dog.run();
    }
}