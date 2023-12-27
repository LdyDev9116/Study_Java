package Jungol10;

import java.util.Arrays;
import java.util.Scanner;
public class TEST01 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int arr [] = new int [num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//
//        }
        Arrays.sort(arr);


        for (int i = num - 1; i >= 0; i--) { // num 배열 개수
            System.out.println(arr[i]);
        }

    }
}
