package oop.day6.domain.advanced.vehicle;

public class Example3 {

    public static void main(String[] args) {

        Bike myBike = new Bike();
        myBike.printType();
        myBike.printBrand();
        myBike.printPrice();

        System.out.println("===============");
        Car car = new Car();
        car.printType();
        car.printBrand();
        car.printPrice();



    }
}
