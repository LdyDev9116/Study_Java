package oop.day3.Team;

public class Customer {

    String name;
    String phoneNumber ;


    int [] basket = new int [3];

    Customer(){

    }
    Customer (String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;


    }

    void addBook(){
        System.out.println(name);
        System.out.println(phoneNumber);
    }


}
