package oop.day1;

public class NutritionFactsMain { // 불변 클래스 여러개 오버로딩하지않고 하나로 "메소드 연쇄방식으로" 표현하여 사용함

    public static void main(String[] args) {

        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).build();

        System.out.println(cocaCola.toString());
    }




}

