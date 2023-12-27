package oop.day5.com.myshop.order.domain;

import java.util.List;

//주문은 '출고상태 변경하기' , '배송지 정보 변경하기' , '주문취소하기 ', '결제완료하기'

public class Order {
    private List<OrderLine> orderLines;
    private ShipingInfo shipinginfo; //반드시 선언 클래스 다이어그램 어디 ?

    private Money totalAmounts;
    private OrderState state;



    public Order(List<OrderLine> orderLines, ShipingInfo shipinginfo) {//3
        setOrderLines(orderLines);
        setShipingInfo(shipinginfo);

    }

    private void setShipingInfo(ShipingInfo shipinginfo) { //배송정보 없다
        if (shipinginfo == null)
            throw new IllegalArgumentException("no shipinginfo");
        this.shipinginfo = shipinginfo;
    }

    private void setOrderLines(List<OrderLine> orderLines) { //1
        verifyAtLestOneorMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

    private void verifyAtLestOneorMoreOrderLines(List<OrderLine> orderLines) {//2 // 주문없다
        if (orderLines == null || orderLines.isEmpty()) {
            throw new IllegalArgumentException("no OrderLine");
        }
    }

    private void calculateTotalAmounts() {
        int sum = orderLines.stream().mapToInt(x -> x.getAmounts()).sum();
        this.totalAmounts = new Money(sum);
    }

    public void changeShipped(ShipingInfo shipinginfo ) {
        verifyNotYetShipped ();
        setShipingInfo(shipinginfo);

    }

    private void verifyNotYetShipped() {
        if (state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING){
            throw new IllegalArgumentException("aleady Shipped");
        }

    }

    public void changeShippingInfo(ShipingInfo newShipping) {
    }

    public void cancel() {
        verifyNotYetShipped();
        this.state = OrderState.CANCELED;

    }

    public void completePayment() {
    }
}
