package oop.day3.bookStore2;

public class BookService {
    private Book[] bookList = {
            new Book.Builder()
                    .id("ISBN1234")
                    .category("쉽게 배우는 JSP 웹 프로그리맹")
                    .price(27000)
                    .author("송미영")
                    .title("단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍")
                    .publisher("IT전문서")
                    .date("2018/10/08")
                    .build(),
            new Book.Builder()
                    .id("ISBN1235")
                    .category("안드로이드 프로그래밍")
                    .price(33000)
                    .author("우재남")
                    .title("실습 단계별 명쾌한 멘토링!")
                    .publisher("IT전문서")
                    .date("2022/01/22")
                    .build(),
            new Book.Builder()
                    .id("ISBN1236")
                    .category("스크래치")
                    .price(2200)
                    .author("고광일")
                    .title("컴퓨팅 사고력을 키우는 블록 코딩")
                    .publisher("컴퓨터 입문")
                    .date("2019/06/10")
                    .build(),
    };
    public void showBookList() {
        if (bookList.length == 0) {
            System.out.println("서점에 책 리스트가 없습니다.");
        }

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.println(bookList[i].getBookInfo());
            }
        }
    }

    public Book[] getBookList() {
        return bookList;
    }
}
