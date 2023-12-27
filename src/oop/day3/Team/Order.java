package oop.day3.Team;

import java.util.Scanner;

public class Order {

    String Name;
    String tel;
    int[] bookList = new int[3];


    // String 값 입력 실시
    String startOrder(String Name, String tel) {
        String str = Name + tel;
        return str;
    }

    // String 값 존재시 메뉴 츌력
    void showMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.println("***********************************");
            System.out.println("Welcome to Shoping Mall");
            System.out.println("Welcome to Book Market!");
            System.out.println("***********************************");

            System.out.print("1. 고객 정보 확인하기        4. 바구니에 항목 추가하기 \n");
            System.out.print("2. 장바구니 상품목록 보기     5. 장바구니의 항목 수량 줄이기 \n");
            System.out.print("3. 장바구니 비우기           6. 장바구니 항목 삭제하기\n");
            System.out.print("7. 영수증 표시하기           8. 종료\n ");
            System.out.println("***********************************");
            System.out.println("메뉴 번호를 선택해주세요");

            break;
        }

//        void showCusinfo(){
//
//        }


    }

}


