package oop.day8.interface_test;

public class Chicken extends Animal implements Cheatable{
    private double distance;
    private double speed;

    Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = speed * hours;
    }

    @Override
    void getDistance() {
        this.getDistance();
    }

    @Override
    public void fly() {
        Cheatable.super.fly();
    }
}
