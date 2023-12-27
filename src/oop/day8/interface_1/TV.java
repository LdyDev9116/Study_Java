package oop.day8.interface_1;
//RemoteControl 인터페이스를 기준으로 해당 TV클래스를 구현 하세요


public class TV implements RemoteControl{
    private int volume;
    private int memoryVolume;

    @Override
    public void turnOn() {  //추상메소드 재정의 (오버라이딩 : overriding)
        System.out.println("Power On");
            }

    @Override
    public void turnOff() {  //추상메소드 재정의 (오버라이딩 : overriding)
        System.out.println("Power Off");
    }

    //RemoteControl 인터페이스를 기준으로 해당 Radio클래스를 구현 하세요
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
    // 3. default method : setMute() 사용
    // RemoteControl 의  : setMute() 무음처리 기능을 TV클래스에서 기존의 볼륨을 기억하여 복원시키는 기능으로 재정의
    public void setMute(boolean mute){
        if (mute ) {
            this.memoryVolume = this.volume;
            System.out.println("Mute Processing 무음처리 되었습니다.");
            setVolume(MIN_VOLUME); // 0
        }else {
            System.out.println("Mute Cancle 무음처리 해지.");
            this.volume = memoryVolume; // 복원
            System.out.println(this.volume);
        }
    }

}



