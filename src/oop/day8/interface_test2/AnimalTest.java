package oop.day8.interface_test2;

public class AnimalTest {
    public static void main(String[] args) {

        Dog dog = new Dog(10);
        Chicken chicken = new Chicken(20);
        Chicken cheatable = new Chicken(10);

        if (cheatable instanceof Cheatable){
            cheatable.fly();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "시간");
            dog.run(1);
            chicken.run(1);
            cheatable.run(1);
            System.out.println("개 :"+dog.getDistance());
            System.out.println("치킨 :"+chicken.getDistance());
            System.out.println("날으는치킨 :"+cheatable.getDistance());

        }
        cheatable.fly();


    }

}
