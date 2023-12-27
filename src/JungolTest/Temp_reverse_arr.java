package JungolTest;

import java.util.Scanner;
public class Temp_reverse_arr {

        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            int num = sc.nextInt();//입력 할 배열수 입력
            int arr [] = new int [num]; // 입력한 만큼 배열 생성

            for (int i = 0; i < arr.length; i++) { //배열만큼 입력
                arr[i] =sc.nextInt();
            }

            //IF 0 1 |30 20 /   0 2 | 20 10/    1 2 | 30 20
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) { // j : 1부터 시작  0 +1
                    if (arr[i] > arr[j]) { //30 > 10 일때  // 0 1 2 돌려서 삽입
                        int tmep = arr[i]; //tmep :30
                        arr[i] = arr[j]; //I: 0  j: 1
                        arr[j] = tmep; // J : 1
                    }
                }
            }

            // 결과값 출력
            System.out.print("작은 수부터 출력 : ");
            for (int i = num - 1; i >= 0; i--) { //// num 배열 개수 0부터 시작 -1
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }

