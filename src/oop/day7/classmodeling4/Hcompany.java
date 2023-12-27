package oop.day7.classmodeling4;

public class Hcompany extends Car{

    private  int price;

    public void getNevigate(){
        System.out.println("내비게이션 on");
    }
    public void getNevigate2(int name){
        this.name = name;
        System.out.println(this.name);
    }



}
