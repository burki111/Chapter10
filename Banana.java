package Fruit;

public class Banana extends Fruit {

    public Banana(){
        setCalories(calories);
    }
    @Override
    public void makejuice(){
        System.out.println("\nBanana juice is tasty");
    }
    public void remove(){
        System.out.println("Remove the banana peel for making juice");
    }
}
