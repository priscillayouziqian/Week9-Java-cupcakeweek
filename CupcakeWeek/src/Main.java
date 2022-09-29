import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create a new ArrayList contains Cupcake, and call it cupcakeMenu
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        //create a new Cupcake object named cupcake
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" + "\nthe menu but we need to decide on pricing");
        //create a Scanner object named input
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();//accept the price into a string
        double price = Double.parseDouble(priceText); //convert it into a double
        cupcake.setPrice(price); //put the converted price as parameter to set the price
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        priceText = input.nextLine();//just repeat the line 21-23 above
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine(); //repeat
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);
        //add each of these Cupcakes objects to the cupcakeMenu ArrayList.
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        //PART 2
        //create a new ArrayList contains Drink
        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Drink water = new Drink(); //create a Drink object-water
        Soda soda = new Soda(); //create a Soda object-soda
        Milk milk = new Milk(); //create a Milk object-milk

        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on" +
                "\nthe menu but we need to decide on pricing");
        // We do not need a scanner object here, because we will just use the one from before
        System.out.println("We are deciding on the price for our bottled water. Here is the description: ");
        water.type();
        System.out.println("How much would you like to charge for the water bottle?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);
        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");
        soda.type();
        System.out.println("How much would you like to charge for the bottled soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);
        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");
        milk.type();
        System.out.println("How much would you like to charge for the bottled milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);
        //add water, soda, milk to drinkMenu
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        //PART 3
        //call the Order constructor-pass in 2 parameters:cupcakeMenu and drinkMenu
        new Order(cupcakeMenu, drinkMenu);
    }
}

class Cupcake{
    public double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake{
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

//PART 2
class Drink{
    public double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void type(){
        System.out.println("A bottle of water");
    }
}
class Soda extends Drink{
    @Override
    public void type() {
        System.out.println("A bottle of soda");
    }
}
class Milk extends Drink{
    @Override
    public void type() {
        System.out.println("A bottle of milk");
    }
}