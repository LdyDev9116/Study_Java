package oop.day9.interface_moring2;

public class SHBank implements Bank {

    int money = 0 ;
    @Override
    public void withDraw(int price) {
        if (MAX_INTEGER > price){
            System.out.println("SH은행만의 인출 로직...");
            System.out.println( price+"원을 인출한다" );
        }else {
            System.out.println("===========");
            System.out.println("SH은행만의 인출 로직...");
            System.out.println("최대 고객에게 인출해 줄 수 있는 금액 : 10000000");
        }

    }

    @Override
    public void deposit(int price) {
        System.out.println("SH은행만의 입금 로직 ..." +price+ "원을 입금한다");
        System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다");

    }


}
