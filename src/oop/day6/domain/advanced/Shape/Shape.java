package oop.day6.domain.advanced.Shape;

public abstract class Shape {

    private String color;

    abstract double area();

    public abstract String toString();

    public String getColor() {
        return this.color;

    }
    public Shape(String color) {
        System.out.println("Shape 클래스 생성자 호출 ");
        this.color = color;
    }

}
