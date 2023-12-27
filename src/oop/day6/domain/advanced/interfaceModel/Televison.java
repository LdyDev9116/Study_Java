package oop.day6.domain.advanced.interfaceModel;

public class Televison implements  RemoteControl{


    @Override
    public void turnOn() {
        System.out.println("TV전원 On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV전원 Off");
    }
}
