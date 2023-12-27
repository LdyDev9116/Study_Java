package Jungol8;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            //1부터 100까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int mult = 1;

            while (true){
                if (((num*mult)%10) == 0) {
                    System.out.print(num*mult + " ");
                    break;
                }
                else if (100 <= (num*mult)) {
                    break;
                }
                System.out.print(num*mult + " ");
                mult++;

            }



        }
    }

