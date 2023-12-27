package oop.day8.interface_1;

public class MultInterfaceMain {
    public static void main(String[] args) {
        RemoteControl remotecontrol;
        Searchable searchable;
        remotecontrol= new SmartTv();
        remotecontrol.turnOn();
        remotecontrol.turnOff();
        remotecontrol.setVolume(20);
        remotecontrol.setMute(true);

        searchable = new SmartTv();
        searchable.search("https://naver.com");


    }
}
