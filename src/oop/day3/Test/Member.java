package oop.day3.Test;

public class Member {

    public String name;
    public String id;
    public String password;
    public int age;



    public Member(){

    }

    public Member(String name , String id ){//
        this.name = name;
        this.id = id;
    }


    public boolean login (String id  , String password  ){

        return true;
    }
    public boolean logout (String id  ){
        System.out.println(id + " 로그아웃 되었습니다.");

        return true;
    }





}
