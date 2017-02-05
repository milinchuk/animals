package model.eat.animal.vegetarian;

import model.eat.Eatable;
import model.eat.animal.Animal;
import model.eat.plant.Plant;

/**
 * Created by click on 2/5/2017.
 */
public abstract class Vegetarian implements Animal {
    protected boolean isItEatVegetarian(Eatable eat) {
        return (eat instanceof Plant);
    }
}
