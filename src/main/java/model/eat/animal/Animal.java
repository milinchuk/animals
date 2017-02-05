package model.eat.animal;

import model.eat.Eatable;

/**
 * Created by click on 2/5/2017.
 */
public interface Animal extends Eatable {
     boolean eat(Eatable food);
}
