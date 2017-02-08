package model.eat.animal.vegetarian;

import model.eat.Eatable;
import model.eat.animal.Animal;
import model.eat.plant.Plant;

/**
 * Created by click on 2/5/2017.
 */
public abstract class Vegetarian implements Animal {
    protected void isItEatVegetarian(Eatable eat) {
        if (!(eat instanceof Plant))
            throw new RuntimeException("Vegetarian can't eat it");
    }
}
