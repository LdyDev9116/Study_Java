package oop.day8.interface_4;

public class DriveMain {
    public static void main(String[] args) {
        Driver driver =new Driver();

        Bus bus = new Bus();
        Texi texi = new Texi();


        driver.driver(bus);     //자동타입변환 (prmotion) --> 오버라이딩메소드 호출 --> 다형성
        driver.driver(texi);
        ride(texi);
        ride(bus);

    }

    //인터페이스 매개변수를 갖는 메소드
    public  static  void ride(Vehicle vehicle){
        if (vehicle instanceof  Bus){ //기존
            Bus bus = (Bus)vehicle;
            bus.checkFare();
        }


        if (vehicle instanceof  Bus bus ) {
            bus.checkFare(); // 자바 12버전부터
            vehicle.run();
        }
    }

}
