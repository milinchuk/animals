package model.eat.animal.predator;

import model.eat.Eatable;

/**
 * Created by click on 2/5/2017.
 */
public class Lion extends Predator {
    public void eat(Eatable e) {
        isPredatorEatThis(e, this);
        System.out.println("Lion eat " + e.getClass().getSimpleName());
    }
}
