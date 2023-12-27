package oop.day3.bookStore2;

public abstract class Person {
    protected String name;
    protected String phoneNumber;
    protected String address;

    public Person() {}
    public Person(String Name, String phone) {
        name = Name;
        phoneNumber = phone;
    }

    public Person(String userName, String phone, String Address) {
        name = userName;
        phoneNumber = phone;
        address = Address;
    }

    public abstract String getPersonInfo();

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
