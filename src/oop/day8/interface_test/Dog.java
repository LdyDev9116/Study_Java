package oop.day8.interface_test;

public class Dog extends Animal{
    private double distance;
    private double speed;

    Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = speed * hours;
    }

    @Override
    void getDistance() {

        return ;
    }


}
