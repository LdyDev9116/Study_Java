package JungolTest;

import java.util.Scanner;

public class Test8_2Self_triangle {

    public static void main(String[] args) {

        //자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.

        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) { //4줄
            for (int j = 0; j < i; j++) { // 1 || 12 || 123 || 1234
                System.out.printf("*", j);
            }
            System.out.println();
        }

        System.out.println("=============================");

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }

        for (int i = 0; i <= 5; i++) {

            System.out.println("*");

        }
        System.out.println("=============================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=============================");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*" ,j);
            }
            System.out.println();
        }
        *//*     *
            **
           ***
          ****
        ******
*/
      for(int i= 5; i>0 ; i--){

          for(int j=1; j<i;j++){
              System.out.print(" ");
          }
          for(int j = 6 ;  j > i; j--){
              System.out.print("*");
          }
          System.out.println();

      }


    }
}












//        for (int i = 0; i <6 ; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

