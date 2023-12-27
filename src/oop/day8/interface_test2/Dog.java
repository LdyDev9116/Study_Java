package oop.day8.interface_test2;

public class Dog extends Animal {


    @Override
    void run(int hours) {
        distance += hours * speed *(0.5);
    }

    public Dog(int speed) {
        super(speed);
    }

}
