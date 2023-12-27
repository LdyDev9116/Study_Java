package oop.day2;

public class BuilderPatterDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal nonvegMel = mealBuilder.prepareNonvegMeal();
        System.out.println("\n\nvegMel");
        nonvegMel.showItems();
        System.out.println("Total Cost" + nonvegMel.getCost());
    }

}
