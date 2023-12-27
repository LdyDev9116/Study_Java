package oop.day3.Test;

public class Student {
    int id ;
    String name;

    //기본생성자
    public Student(){

    }

    // insert를 하기위한 생성자
    public Student(int param1, String param2){
        id= param1;
        name= param2;
    }

    // insert 를 위한 메소드
    void insertRecord (int param1, String param2) {
        id = param1;
        name = param2;
    }

    void printInfo(){
        System.out.println("ID: "+ id );
        System.out.println("Name: "+ name );

    }



}
