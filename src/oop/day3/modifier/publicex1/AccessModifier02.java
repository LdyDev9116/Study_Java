package oop.day3.modifier.publicex1;

import oop.day3.modifier.publicex.Animal;
import oop.day3.modifier.publicex.Dog1;

public class AccessModifier02 {

    public static void main(String[] args) {

        Dog1 dogObject1 = new Dog1();
        dogObject1.bread = "포메";
        dogObject1.color = "흰색";
        //dogObject1.age = 5;
//        Animal animal = new Animal();
//        animal.name = "푸바우";
//        System.out.println(animal.getName());
//        animal.color = "갈색";
//        animal.getColor();

        //System.out.println( dogObject1.bread + " " +dogObject1.color+ " " +dogObject1.age);
        dogObject1.bowwow();
        //dogObject1.run();

    }
}
