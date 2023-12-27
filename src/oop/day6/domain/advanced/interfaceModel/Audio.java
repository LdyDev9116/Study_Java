package oop.day6.domain.advanced.interfaceModel;

public class Audio implements  RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Audio 전원 on");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 전원 off");
    }
}
