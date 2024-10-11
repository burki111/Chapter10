package Fruit;

public class Apple extends Fruit {


    public Apple() {
        setCalories(calories);
    }

    @Override
    public void makejuice(){
        System.out.println("Apple juice is tasty");
    }
    public void clean(){
        System.out.println("Remove the apple seeds for making juice");
    }



}
