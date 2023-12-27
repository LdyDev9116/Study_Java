package oop.day8.interface_1;

public class SmartTv implements RemoteControl,Searchable  {
    private int volume;
    private int channel;
    @Override
    public void turnOn() {
        System.out.println("SmartTv 전원 on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTv 전원 off");
    }

    @Override
    public void setVolume(int volume) {   //추상메소드 재정의 (오버라이딩 : overriding)
        //인터페이스 상수 MAX_VOLUME 과 LOW_VOLUME 사용하여
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME - 15;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 :" + this.volume);
    }

//    @Override
//    public void mute( ) {
//    }

    @Override
    public void search(String url) {
        System.out.println(url + "검색합니다.");
    }

    @Override
    public void channeUp(int channel) {
        this.channel ++;
    }

    @Override
    public void channeDown(int channel) {
        this.channel --;
    }
}
