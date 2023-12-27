package oop2;

public class PersonMain2 {
    public static void main(String[] args) {
    //이름 나이 주소 전화번호를 생성자를 이용하여 초기화한다

        //1. Person2 클래스의 static class  Builder객체생성
        // -> 다시생성자로 안에있는 값들을 build()  함수로 호출 사용
        //2.
        Person2 str  = new Person2.Builder
                ("str").age("20").tel("010-1234-5678")
                .address("서울시강남").build();
        str.personinfomation();
//


    }
}
