package Jungol8;

import java.util.Scanner;

public class Test8_2Self {

    public static void main(String[] args) {

        //자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0");
            }
            for (int k = 3; k-i > 0; k--) {
                System.out.print("*");
            }
            System.out.println("X");

        }


    }
}




//        Scanner sc = new Scanner(System.in);
//        int num = 0 ;
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
//
//
//        }
//    }
    //////////////////////////////////////////////////////



//
//
//        //자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
//
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for (int i = 0; i <num ; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.printf("*", j);
//            }
//            System.out.println();
//        }
//
//    }
//}

//        for (int i = 0; i <6 ; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

