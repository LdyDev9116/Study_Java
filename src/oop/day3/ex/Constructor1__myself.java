package oop.day3.ex;

public class Constructor1__myself {
    public static void main(String[] args) {

        Add_myself numObj1 = new Add_myself();

//        System.out.println(numObj1.Add( numObj1.getDeclaredMethod()  ));
//        System.out.println(numObj1.Add_myself(1,2));
        System.out.println(numObj1.Add(2.4, 6.2));
        System.out.println(numObj1.Add(3, 5.5));

        System.out.println("======================================");
        Add_myself numObj2 = new Add_myself(100,200 );
//        System.out.println(numObj2.Add(numObj2.getA(), numObj2.getB()));



    }

}
