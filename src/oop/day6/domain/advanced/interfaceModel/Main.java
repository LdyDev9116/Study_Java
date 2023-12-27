package oop.day6.domain.advanced.interfaceModel;

public class Main {

    public static void main(String[] args) {

//        Televison televison = new Televison();
//        televison.turnOn();

        RemoteControl rc1;
//        RemoteControl rc2;
        rc1 = new Televison();
        rc1.turnOn();
        rc1.turnOff();


        rc1 = new Audio();

        rc1.turnOn();
        rc1.turnOff();



    }
}
