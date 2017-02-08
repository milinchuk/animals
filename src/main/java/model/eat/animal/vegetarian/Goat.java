package model.eat.animal.vegetarian;

import model.eat.Eatable;

/**
 * Created by click on 2/5/2017.
 */
public class Goat extends Vegetarian {
    @Override
    public void eat(Eatable food) {
        isItEatVegetarian(food);
        System.out.println("Goat eat " + food.getClass().getSimpleName());
    }
}
