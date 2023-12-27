package oop.day3.Test;

public class StudentMain {
    public static void main(String[] args) {

        Student stoObj = new Student();
        stoObj.insertRecord(20021004, "홀길순");
        stoObj.printInfo();


        Student stoObj2 = new Student(20021005, "홀길동");
//        stoObj2.insertRecord(20021005, "홀길동");
        stoObj2.printInfo();

    }
}
