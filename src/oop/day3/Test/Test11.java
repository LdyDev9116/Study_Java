package oop.day3.Test;

public class Test11 {
    public static void main(String[] args) {

        int[][] array = { {95,86}, {83,92,96}, {78,83, 93,87,88}   };
        int sum =0 ;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum += array[i][j] ;
            }
        }
        System.out.println("sum:"+ sum);

    }

}
