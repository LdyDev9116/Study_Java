package oop.day7.starbuks2;

public class MyNotebook {

    private Wifi internet;

    public  MyNotebook(Wifi wifi) {
        this.internet  = wifi;
    }
    void openBrowser() {
        //인터넷을 이용하여 브라우저를 동작한다.
        // this.internet
        this.internet.connectionInternet();
    }

}
