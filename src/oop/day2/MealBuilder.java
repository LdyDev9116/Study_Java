package oop.day2;

public class MealBuilder {
    public  Meal preparevegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem((Item) new Coke());
        return meal;
    };

    public  Meal prepareNonvegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBuger());
        meal.addItem((Item) new Pepsi());

        return meal;

    };

}
