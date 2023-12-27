package oop.day3.bookStore2;

import java.util.Scanner;

public class Order {

        private Customer customer;
        private Admin admin;
        private int basketNum = 0;
        private Book basket[] = new Book[10];
        BookService bookService = new BookService();

        Scanner sc = new Scanner(System.in);

        public void login() {

                System.out.print("당신의 이름을 입력하세요 : ");
                String name = sc.nextLine();

                System.out.print("연락처를 입력하세요 : ");
                String phoneNumber = sc.nextLine();

                customer = new Customer(name, phoneNumber);
                admin = new Admin(name, phoneNumber);

                System.out.println("**************************");
                System.out.println("Welcome to Shopping Mall");
                System.out.println("Welcome to Book Market!\n");
        }

        public void adminLogin() {
                System.out.println("관리자 정보를 입력하세요");
                System.out.print("아이디 : ");
                String id = sc.nextLine();
                System.out.print("비밀번호 : ");
                String password = sc.nextLine();

//                System.out.println(admin.getId());
//                System.out.println(admin.getPassword());

                if (id.equals(admin.getId()) && password.equals(admin.getPassword())) {
                        System.out.println(admin.getPersonInfo());
                }
                else {
                        System.out.println("관리자 정보가 일치하지 않습니다.");
                }

        }
        public void startOrder() {

        }

        public void showMenu() {
                System.out.println("\n************************************************************************");
                System.out.println("1. 고객 정보 확인하기 2. 장바구니 상품 목록 보기 4. 바구니에 항목 추가히기 8. 종료 9. 관리자 로그인");
                System.out.println("************************************************************************\n");
                System.out.print("메뉴 번호를 선택해주세요 ");
        }

        public void showBasketList() {
                boolean isBasketEmpty = true;

                System.out.println("\n장바구니 목록:");

                for (Book book : basket) {
                        if (book == null) continue;

                        System.out.print(book.getBookInfo());
                        isBasketEmpty = false;
                }

                if (isBasketEmpty) System.out.println("장바구니가 비어있습니다.");
        }

        public void addBasketList() {
                Book pickedBook = null;

                while (true) {
                        if (pickedBook != null) break;

                        System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");
                        String inputID = sc.nextLine();

                        for (Book book : bookService.getBookList()) {
                                if (book.getId().equals(inputID)) {
                                        pickedBook = book;
                                }
                        }

                        if (pickedBook == null) {
                                System.out.println("유효하지 않은 아이디입니다.\n");
                        } else {
                                System.out.println("장바구니에 추가하겠습니까? Y | N");
                                char inputAnswer = sc.nextLine().charAt(0);

                                if (Character.toUpperCase(inputAnswer) == 'Y') {
                                        basket[basketNum] = pickedBook;

                                        System.out.printf("%s 도서가 장바구니에 추가되었습니다.%n", basket[basketNum].getId());

                                        basketNum++;
                                }

                                if (Character.toUpperCase(inputAnswer) == 'N') {
                                        break;
                                }
                        }
                }
        }
        public void showCustomerInfo() {
                System.out.print(customer.getPersonInfo());
        }

}