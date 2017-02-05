package model.eat.animal.predator;

import model.eat.Eatable;
import model.eat.animal.Animal;

/**
 * Created by click on 2/5/2017.
 */
public abstract class Predator implements Animal {
    protected boolean isPredatorEatThis(Eatable eat, Predator currentClass){
        return !(eat.getClass().equals(currentClass.getClass()));
    }
}
