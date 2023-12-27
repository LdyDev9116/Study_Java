package oop.day3.modifier.publicex1;

import oop.day3.modifier.publicex.Dog;

public class AccessModifier01 {

    public static void main(String[] args) {

        Dog dogObject1 = new Dog();


        dogObject1.bread = "포메";
        dogObject1.color = "흰색";
        System.out.println( dogObject1.bread + " " +dogObject1.color);
        dogObject1.bowwow();

    }
}
