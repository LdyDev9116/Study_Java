package oop.day3.bookStore_temp;

public abstract class Person {
    protected String name;
    protected String phoneNumber;
    protected String address;


    public Person(String name, String phone) {
        this.name = name;
        this.phoneNumber = phone;
    }
    public Person( String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

//    public abstract String getPersonInfo();

    public String getPersonInfo() {
        return "이름 : %s%n연락처 : %s".formatted(this.name, this.phoneNumber);
    }


//    public String getPersonInfo() {
//        return "고객 이름 : %s%n고객 전화번호 : %s%n".formatted(this.name, this.phoneNumber);
//    }





}
