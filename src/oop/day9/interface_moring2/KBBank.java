package oop.day9.interface_moring2;

public class KBBank implements Bank {

    private double balance;
    @Override
    public void withDraw(int price) {
        System.out.println("KB은행만의 인출 로직 ..." +price+"원을 인출한다" );
        if (price < Bank.MAX_INTEGER){
            System.out.println(price+"원인출");
        }else{
            System.out.println(price+"원 인출 실패");
        };

    }

    @Override
    public void deposit(int price) {
        this.balance += balance;
        System.out.println("KB은행만의 인출 로직 ..." +price+ "원을 입금한다");
    }


}
