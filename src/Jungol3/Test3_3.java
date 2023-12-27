package Jungol3;

public class Test3_3 {
    public static void main(String[] args) {
        //정수형 변수 a와 b를 만들고 각각 10으로 초기화한 후 다음과 같이 출력하는 프로그램을 작성하시오. 
        //출력 ..

        int a, b;
        a = 10;
        b = 10;

        System.out.print("최초값 a = " + a + ", " );
        System.out.print("b = " + b );

        System.out.println();
        System.out.println();
        System.out.print("a++ = " + a++ + ", " );
        System.out.print("++b = " + ++b );
        System.out.println();
        System.out.print("실행후 a = " + b + ", ");
        System.out.print("b = " + b );


        System.out.println();
        System.out.println();
        System.out.print("a-- = " + a-- + ", " );
        System.out.print("--b = " + --b );
        System.out.println();
        System.out.print("실행후 a = " + b + ", ");
        System.out.print("b = " + b );
    }

}
