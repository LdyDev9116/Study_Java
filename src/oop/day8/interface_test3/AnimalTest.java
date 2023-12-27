package oop.day8.interface_test3;

public class AnimalTest {
    public static void main(String[] args) {

        Dog dog =new Dog(5);
        Chicken chicken = new Chicken(3);
        Chicken cheatable = new Chicken(3);

        if (cheatable instanceof Cheatable){
            cheatable.fly();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "시간");
            dog.run(1);
            chicken.run(1);
            cheatable.run(1);

        }
        System.out.println(dog.getDistance());
        System.out.println(chicken.getDistance());
        System.out.println(cheatable.getDistance());

    }

}
