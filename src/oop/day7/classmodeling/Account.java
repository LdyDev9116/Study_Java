package oop.day7.classmodeling;

public class Account {

    private int balance ;


    public int deposit(int money){
        System.out.println("고객님이 입금하신 금액은 " + money + "입니다");
        System.out.println("예금을 진행하겠습니다 " );
        this.balance += money;
        balancePrint(money);
        System.out.println("계좌의 잔고는" + this.balance);
        return this.balance;
    }

    public  void  balancePrint(int money2){
        System.out.println("고객님이 입금하신 금액은" + money2);
    }



}
