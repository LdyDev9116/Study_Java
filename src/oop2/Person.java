package oop2;

public class Person {

    public String name;
    public String age;
    public String address;
    public String tel;

    public  String data= "";

    public  Person(){

    }
    public  Person( String name , String age, String address, String tel ){// overloding : 메소드의 매개변수 타입변경, 개수를 변경
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;
    }
    // 리턴 받아서 출력
    public String data (String name , String age, String address, String tel){
        return data ;
    }

    //함수출력
    public void personinfomation() {
        System.out.println(name+"의 나이는"  + age +"이고 주소는 "+ address +"이며 전화번호는 "+ tel );
    }









}
