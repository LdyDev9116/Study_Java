package oop.day9.isp.refactor;

import oop.day9.isp.before.Bank;
import oop.day9.isp.before.Duty;

/**
 * packageName : oop.isp.before
 * fileName : BBAnk
 * author :
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class UnhappyBank implements PrivateBanking {


    @Override
    public void doPrivateBanking() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), Duty.PB));
    }
}
