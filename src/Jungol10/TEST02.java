package Jungol10;

import java.util.Scanner;

public class TEST02 {
    public static void main(String[] args) {
        int [] arr = new int [100];
        int num = 0;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        arr[0] = 100;
        arr[1] = num;

        for(int i= 2; i<arr.length;i++) {
            arr[i] = arr[i - 2] - arr[i - 1];
            if (arr[i] < 0) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(arr[j] + " ");
                }
                break;
            }
        }
    }
}