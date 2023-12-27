package oop.day3.bookStore2;

import java.util.Scanner;

public class BookStoreMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        order.login();
        //order.startOrder();

        while (true) {
            order.showMenu();

            String temp = sc.nextLine();
            int inputNum = Integer.parseInt(temp);

            if (inputNum == 8) {
                System.out.println("프로그램 종료");
                break;
            }

            switch (inputNum) {
                case 1 -> order.showCustomerInfo();
                case 2 -> order.showBasketList();
                case 4 -> {
                    order.bookService.showBookList();
                    order.addBasketList();
                }
                case 9 -> order.adminLogin();
                default -> System.out.println("없는 번호입니다.");
            }
        }

    }
}
