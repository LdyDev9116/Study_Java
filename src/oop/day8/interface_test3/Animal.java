package oop.day8.interface_test3;

public abstract class Animal {
    protected int speed;

    protected double distance;

    public Animal(int speed) {
        this.speed = speed;

    }
    abstract void run(int hours);


    public double getDistance() {
        return distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
