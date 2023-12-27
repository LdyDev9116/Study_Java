package Jungol9;

import java.util.Scanner;

public class Test_Main_9_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0){
                break;
            }


        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i]+ " ");
            }
        }





    }
}
