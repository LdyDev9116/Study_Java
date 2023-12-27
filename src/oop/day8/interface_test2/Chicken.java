package oop.day8.interface_test2;

public class Chicken extends Animal implements Cheatable {

    Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance += hours * speed ;
    }

    @Override
    public void fly() {
        this.speed *= 1;
    }




}
