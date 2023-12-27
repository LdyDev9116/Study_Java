package oop.day4.inher;

public class BabyCat extends ParentCat{

    private String  color;

    BabyCat(){

    }
    BabyCat(String color ){
        super("샴고양이" );
        this.color = color;
    }
    //////////////////////////////// BabyCat 생성자

    public void meow(){
        System.out.println("냐오옹!");
    }

    public void printInfo(){
        getBread();
//        System.out.println(super.bread); // 내부모거
        System.out.println(this.color); // 내거
    }



}
