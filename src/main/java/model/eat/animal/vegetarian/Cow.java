package model.eat.animal.vegetarian;

import model.eat.Eatable;

/**
 * Created by click on 2/5/2017.
 */
public class Cow extends Vegetarian {
    @Override
    public void eat(Eatable eatable) {
        isItEatVegetarian(eatable);
        System.out.println("Cow eat " + eatable.getClass().getSimpleName());
    }
}
