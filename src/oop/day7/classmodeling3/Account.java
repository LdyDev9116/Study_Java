package oop.day7.classmodeling3;

public class Account {

    private int balance ;
    private  String accountNumber;
    private  String name;
    private  String password;


    Account(){}
    Account(String accountNumber, String name,  String password ){
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;

    }

    public int deposit(int money){
        System.out.println(name+"고객님이 입금하신 금액은 " + money + "입니다");
        System.out.println("고객님이 입금하신 금액은 " + money + "입니다");
        System.out.println("예금을 진행하겠습니다 " );
        this.balance += money;
//        balancePrint();
        System.out.println("계좌의 잔고는" + this.balance);
        return this.balance;
    }

    public  void  balancePrint(){

    }
    ////////////////////////////////////////////
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
