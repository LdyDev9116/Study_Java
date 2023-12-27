package oop.day7.starbuks;

public class MyNotebook {

    private Wifi internet;

    public  MyNotebook() {
//        this.internet  = wifi; //여기를 없애면 사장님만 사용
        this.internet = new Wifi(); //컴포지션

    }
    void openBrowser() {
        //인터넷을 이용하여 브라우저를 동작한다.
        // this.internet
        this.internet.connectionInternet();
    }

}
