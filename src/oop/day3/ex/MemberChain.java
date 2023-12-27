package oop.day3.ex;

public class MemberChain {

    String firstName;
    String country;
    int age;

    public  MemberChain(){
        this("홀길동");
    }

    public  MemberChain(String firstName){
        this(firstName, 20);
    }
    public  MemberChain(String firstName, int age){
        this(firstName, age, "대한민국");
    }
    public  MemberChain(String firstName, int age, String country ){
        this.firstName= firstName;
        this.age = age;
        this.country= country;
    }


    void printInfo(){
        System.out.println("이름: " + firstName);
        System.out.println("국적: " + country);
        System.out.println("나이: " + age);
    }


}
