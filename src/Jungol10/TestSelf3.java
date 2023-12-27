package Jungol10;

import java.util.Scanner;

public class TestSelf3 {

    public static void main(String[] args) {
        //반복제어문1_자가진단3
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.printf("number? ");
            int i = sc.nextInt();
            if (i == 0){
                System.exit(0);
            }
            if (i > 0){
                System.out.println("positive integer");
            }
            if (i < 0){
                System.out.println("negative number");
            }
        }

    }

}
