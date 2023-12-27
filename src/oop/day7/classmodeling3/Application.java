package oop.day7.classmodeling3;

public class Application {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.deposit(1000);


        System.out.println("==========================");
        Account account2 = new Account("7777","신세계","1234");

        account2.deposit(2000);
    }

}
