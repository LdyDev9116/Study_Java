package oop.day4.inher;

public class ParentCat {

    protected String bread;


    ParentCat(){}

    ParentCat(String  bread){
        this.bread = bread;

    }
    //////////////////////////////// ParentCat 생성자


    public  void eat() {
        System.out.println("냠냠 먹이를 먹다");
    }

    public String getBread() {
        return bread;
    }
}
