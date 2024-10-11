package Fruit;

import Chapter10.Animal;
import Chapter10.Cat;
import Chapter10.Dog;

public class Market {
    public static void main(String[] args) {

        Fruit type = new Apple();
        type.makejuice();
        ((Apple) type).clean();
        mixer(type);
        type.setCalories(100);
        System.out.println("Apple calories are:" + type.getCalories());

        type= new Banana();
        type.makejuice();
        ((Banana) type).remove();

        type.setCalories(200);
        System.out.println("Banana calories are:" + type.getCalories());
        mixer(type);


    }

    public static void mixer(Fruit fruit) {
        if (fruit instanceof Apple) {
            System.out.println("Here's your apple juice");
        } else if (fruit instanceof Banana) {
            System.out.println("here's your banana juice");
        }
    }
}