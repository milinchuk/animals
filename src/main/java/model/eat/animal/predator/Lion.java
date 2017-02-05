package model.eat.animal.predator;

import model.eat.Eatable;

/**
 * Created by click on 2/5/2017.
 */
public class Lion extends Predator {
    public boolean eat(Eatable e) {
        return isPredatorEatThis(e, this);
    }
}
