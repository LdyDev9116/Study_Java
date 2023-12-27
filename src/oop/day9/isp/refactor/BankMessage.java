package oop.day9.isp.refactor;

import oop.day9.isp.before.Duty;

public interface BankMessage {

    default String messageSend(String bankName, Duty duty) {
        return String.format("%s는 %s를 합니다.", bankName, duty.description());
    }


}
