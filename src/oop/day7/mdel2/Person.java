package oop.day7.mdel2;

public class Person {

/*    private Phone phone;

    Person(Phone phone){
        this.phone =phone;
    }

    public void createMessage(){
        String message = "안녕 반가워 오늘 몇시에 만날까";
        String to = "내친구";
        // 폰의 문자 전송기능 호춣
         this.phone.sendMessage(to, message);

    }*/

    // 메소드에의해
    public void sendMessage(Phone phone){
        String  to = "나의 벗";
        String  message = "보고싶다";
        phone.sendMessage(to , message);

    }

}
