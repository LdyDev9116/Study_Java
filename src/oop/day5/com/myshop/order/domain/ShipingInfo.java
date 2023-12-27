package oop.day5.com.myshop.order.domain;

public class ShipingInfo {
    //1. 기본생성자
    //2. get 만들기

    private String receiverName;
    private String receiverPhoneNumber;
    private String receiverAddress1;
    private String receiverAddress2;
    private String receiverzipCode;

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public String getReceiverAddress1() {
        return receiverAddress1;
    }

    public String getReceiverAddress2() {
        return receiverAddress2;
    }

    public String getReceiverzipCode() {
        return receiverzipCode;
    }
}
