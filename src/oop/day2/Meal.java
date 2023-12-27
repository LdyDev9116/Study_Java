package oop.day2;

import java.util.ArrayList;
import java.util.List;


public class Meal {
    // -  ( private ) 접근 제한자로 설정 )
    private List<Item> itmes = new ArrayList<Item>();

    public void  addItem(Item item){// 메소드 생성
        itmes.add(item); //itmes  ArrayList 생성

    }
    public  float getCost(){
        float cost = 0.0f;
        for (Item item : itmes) {
            cost += item.price();

        }
        return  cost;


    }

    public  void  showItems(){
        for (Item itme : itmes) {
            System.out.println("Itmes :" + itme.name());
            System.out.println(", Packing :" + itme.packing().pack() );
            System.out.println("Price :" + itme.price());
        }
    }




}
