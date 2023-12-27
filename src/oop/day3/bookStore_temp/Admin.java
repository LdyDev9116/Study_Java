package oop.day3.bookStore_temp;

public class Admin extends Person {
    private String id;
    private String password;
    public Admin(String name, String phoneNumber, String id, String password) {
        super(name, phoneNumber);

        this.id = id;
        this.password = password;
    }

    @Override
    public String getPersonInfo() {
        return "이름 : %s%n" +
                "연락처 : %s%n" +
                "아이디 : %s%n" +
                "비밀번호 : %s%n".formatted(
                        this.name, this.phoneNumber, this.id, this.password
                );
    }

    public String getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }
}