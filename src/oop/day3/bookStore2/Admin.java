package oop.day3.bookStore2;

public class Admin extends Person{
    private String id = "Admin";
    private String password = "Admin1234";

    public Admin(String Name, String PhoneNumber) {
        name = Name;
        phoneNumber = PhoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String getPersonInfo() {
        return "이름 " + name + "  연락처 " + phoneNumber + "\n" + "아이디 " + id + "   비밀번호 " + password;
    }
}
