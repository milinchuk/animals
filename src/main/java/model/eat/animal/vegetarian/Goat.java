package model.eat.animal.vegetarian;

import model.eat.Eatable;

/**
 * Created by click on 2/5/2017.
 */
public class Goat extends Vegetarian {
    @Override
    public boolean eat(Eatable food) {
        return isItEatVegetarian(food);
    }
}
