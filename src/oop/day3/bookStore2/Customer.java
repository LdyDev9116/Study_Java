package oop.day3.bookStore2;

public class Customer extends Person{

    public Customer(String Name, String PhoneNumber) {
        name = Name;
        phoneNumber = PhoneNumber;
    }

    @Override
    public String getPersonInfo() {
        return "고객 이름 : %s%n고객 전화번호 : %s%n".formatted(name, phoneNumber);
    }
}