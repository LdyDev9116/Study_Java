package oop.day6.domain.advanced.abstractclass;

public class Dog extends AbstractDog{
    @Override
    public void printSound() {
        System.out.println("멍멍");
    }

    @Override
    public void tailing() {
        System.out.println("살랑살랑");
    }
}
