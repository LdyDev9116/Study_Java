package oop.day1;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student("손흥민" ,"축구");


        System.out.println(s3);
        System.out.println("====================================");


        System.out.println(s1.toString());
        System.out.println(s2.toString());

        s1.name ="홀길동";
        s1.major ="컴퓨터공학";

        String eat =  s1.eat("자장면"); //여기에는 써줘야함 String 아규먼트
        System.out.println(s1.name + " 학생이 " +eat + " 먹었다 ");
        s2.name ="김진아";
        s2.major ="건축학";
//        System.out.println( s1.name + s1.major); //홀길동컴퓨터공학
//        System.out.println( s2.name + s2.major);//김진아건축학
        System.out.println(s2.name );

        System.out.println("====================================");
        System.out.println( s3.name  + s3.major + s3.eat("떡볶이"));




    ///////////////////////////////////////////




    }
}
