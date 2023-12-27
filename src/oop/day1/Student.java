package oop.day1;

public class Student {

    public String name;
    public String major;

    public  Student(){

    } //default constructor // 자동적으로 만들어주나 오버로딩시 자동생성 x

    public  Student( String name , String major ){// overloding : 메소드의 매개변수 타입변경, 개수를 변경
        this.name = name;
        this.major = major;
    }


    public  Student( String name ){//
        this.name = name;
    }
//    public  Student( String major ){//
//        this.major = major;
//    }


    public void study(){
        int studyE = 0;
        studyE++;

        System.out.println("학습 능력이 1+ 상승했습니다.");
    }

    public String eat(String food){
        return food + "를 맛있게 냠냠!";
    }
//




//    public  String Department = "학과출력" ;
//    public String name = "이도엽" ;




}
