package model.test;

public class C {

    public static void main(String[] args) {
        A s1 , s2; //A 클래스
        B x1, x2; //B 클래스

        s1 = new A();//A 클래스
        s2 = new A();

        x1 = new B();//B 클래스
        x2 = new B();


        s1.a1();
        s1.a2();
        x1.b1();
        String data = s1.a3(); //여기 입력해줬넹

        //B타입의 x1 객체에 b4()메소드를 작성하세요.
        //(요구조건) A타입의 a3메소드에서 제공한 값을 받아서
        // "A클래스의 data는 B타입의 x1객체에서 처리하였습니다."

        System.out.println();
        x1.b4(data);
    }
}
