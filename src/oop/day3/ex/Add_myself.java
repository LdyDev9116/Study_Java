package oop.day3.ex;

public class Add_myself {

    private  int a, b;
    Add_myself(){}
    Add_myself(int a , int b){
        this.a = a;
        this.b = b;

    }


      int  Add(int a, int b){
        return  a+b;
    }
       double Add(double a, double b){

        return a+b;
    }
    double Add(int  a, double b){
        return a+b;
    }



    //private 일경우 접근방법
//    public int getA() {
//        return a;
//    }
//
//    public int getB() {
//        return b;
//    }



}
