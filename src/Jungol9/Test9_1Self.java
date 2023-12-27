package Jungol9;

import java.util.Scanner;

public class Test9_1Self {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ch =  sc.nextLine() ;
        String[] str = ch.split("");

        for (int i = 0; i < 10; i++) {
            System.out.print(str[i]);
        }


    }
}
