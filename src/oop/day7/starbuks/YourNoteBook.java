package oop.day7.starbuks;

public class YourNoteBook {

    private Wifi internet;

    public  YourNoteBook(Wifi wifi) {
//        this.internet  = wifi;
        this.internet = new Wifi(); //어그리게이션  못쓰는게 정상  Wifi internet = new Wifi(); 원래는 있으면 공유로 씆낳아
    }
    void openKakaTalk() {
        //인터넷을 이용하여 카카오톡을 동작시킨다.
        // this.internet
        this.internet.connectionInternet();
    }


}
