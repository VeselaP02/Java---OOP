package Lab_Inheritance.TASK_2;

import java.util.ArrayList;

public class Animal extends ArrayList<Food>{

    protected ArrayList<Food> foodEaten;

    public final void eat (Food food){
        foodEaten.add(food);
    }

    public void eatAll(Food[] foods){
        foodEaten.addAll(0,foodEaten);
    }
}
