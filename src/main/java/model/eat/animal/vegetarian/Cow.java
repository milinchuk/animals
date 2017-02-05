package model.eat.animal.vegetarian;

import model.eat.Eatable;

/**
 * Created by click on 2/5/2017.
 */
public class Cow extends Vegetarian {
    @Override
    public boolean eat(Eatable eatable) {
        return isItEatVegetarian(eatable);
    }
}
