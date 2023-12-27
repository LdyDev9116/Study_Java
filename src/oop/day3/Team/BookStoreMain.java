package oop.day3.Team;

import java.util.Scanner;

public class BookStoreMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = new Order();


        // 이름과 연락처 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String str1 = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String str2 = sc.nextLine();

        order.startOrder(str1, str2);
        if(order.startOrder(str1, str2) != null){
            System.out.println("입력한 번호와 이름 입력 반환 성공 메뉴바 보여줌");
            order.showMenu();
        }









////        Customer customer = new Customer("010-2222-3333", "홍길동");
//        Customer customer = new Customer();
////        customer.addBook();
//
//
//        Order order = new Order();
//        order.showMenu();









//        Order order1 = new Order();
//        order1.showMenu();









    }

}
