package Jungol10;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int count = 0; //개수 변수

//        int [] scores = {80,90,87} ; //미리 있을때
        int [] scores = new int [3] ; // scan으로 입력 변경

        Scanner sc = new Scanner(System.in);
        //여러번 입력하기위해 for문  위에 [3]까지만 실행
        for (int i = 0; i < scores.length; i++) {
            int num = sc.nextInt();
            scores[i] = num;
            if (num == 0){
                break;
            }
            ++count;
        }

        System.out.println("합계:" + PrintItemadd(scores));
        System.out.println("평균:" + PrintItemavg(scores));
        System.out.println("개수:" + count);


    }
    //합계 메소드
    public static int PrintItemadd(int [] scores ){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return sum;
    }
    //평균 메소드
    public static double PrintItemavg(int [] scores ){
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double result = sum /  scores.length;

        return result;
    }
    //성적을 저장할 정수형 1차원 배열 scores 선언
    // scores 에 {80,90,87} 대입

    //출력시 PrintItem static method를 작성. scores(배열)을 매개값으로 전달하여
    //scores의 항목(점수)를 출력한 후
    // scores의 총합을 구하고 총합과 평균을 출력하세요
    //출력예시 :
    // 점수 : 80 , 90 , 87
    // 총합 : 00  평균: 00.0  평균은 소수 첫째자리까지


}