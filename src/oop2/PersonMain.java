package oop2;

public class PersonMain {
    public static void main(String[] args) {
    //이름 나이 주소 전화번호를 생성자를 이용하여 초기화한다
//        name age address tel
//         personinfomation()  주소
//        출력결과 : 신세계의 나이는 20살이고 주소는 서울시 강남구이며 전화번호는 010 -1234 - 4568

        Person p1 = new Person("신세계", "20살", "서울시 강남구", "010 - 1234 - 4568");
        System.out.println( p1.name  + p1.age  + p1.address  + p1.tel ); // 리턴 받아서 출력
        p1.personinfomation(); //함수출력

    }
}
