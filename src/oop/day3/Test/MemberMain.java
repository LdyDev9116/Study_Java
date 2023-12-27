package oop.day3.Test;

public class MemberMain {

    public static void main(String[] args) {

        Member s1 = new Member();
        Member s2 = new Member();
//        String s3 = new Member("손흥민" ,"축구", "dd").toString();


        // 8.
        System.out.println(s1);
        s1.name ="홀길동";
        s1.id ="hong";

        System.out.println(s1.name);
        System.out.println(s1.id);

        System.out.println("====================================");

        System.out.println(s1);
        s2.name ="홀길동";
        s2.id ="hong";
        s2.password ="1234";

        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s2.password);
        System.out.println(s1.login("hong","12345" ));
        System.out.println(s1.logout("hong"));




//        System.out.println(s3);

//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//
//        s1.name ="홀길동";
//        s1.major ="컴퓨터공학";
//
//        String eat =  s1.eat("자장면"); //여기에는 써줘야함 String 아규먼트
//        System.out.println(s1.name + " 학생이 " +eat + " 먹었다 ");
//        s2.name ="김진아";
//        s2.major ="건축학";
////        System.out.println( s1.name + s1.major); //홀길동컴퓨터공학
////        System.out.println( s2.name + s2.major);//김진아건축학
//        System.out.println(s2.name );
//
//        System.out.println("====================================");
//        System.out.println( s3.name  + s3.major + s3.eat("떡볶이"));
//



    ///////////////////////////////////////////




    }
}
