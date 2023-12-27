package oop.day6.domain.advanced.Shape;

import oop.day6.domain.advanced.vehicle.Bike;
import oop.day6.domain.advanced.vehicle.Car;

public class ExampleMain {

    public static void main(String[] args) {

        Circle circle = new Circle("red", 3.5);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("red", 3.0, 4.0);
        System.out.println(rectangle.toString());


    }
}
