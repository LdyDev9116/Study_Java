package Jungol3;

public class Test3_8Self {
    public static void main(String[] args) {
        int n = 3; // 패턴의 높이

        // 위쪽 삼각형 출력
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // @ 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("@");
            }

            //
            System.out.println();
        }

        // 아래쪽 삼각형 출력
        for (int i = n - 2; i >= 0; i--) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // @ 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("@");
            }

            //
            System.out.println();
        }
    }

}