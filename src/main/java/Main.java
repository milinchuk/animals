import model.eat.Eatable;
import model.eat.animal.Animal;
import model.eat.animal.predator.Lion;
import model.eat.animal.vegetarian.Cow;
import model.eat.plant.Grass;
import model.eat.plant.Plant;

/**
 * Created by click on 2/5/2017.
 */
public class Main {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal lion = new Lion();
        Animal leo = new Lion();

        Plant plant = new Grass();

        print(cow, lion, cow.eat(lion));
        print(cow, cow, cow.eat(cow));
        print(cow, plant, cow.eat(plant));

        print(lion, cow, lion.eat(cow));
        print(lion, cow, lion.eat(lion));
        print(lion, cow, lion.eat(plant));
    }

    private static void print(Eatable eater, Eatable eat, boolean answer) {
        String eaterName = eater.getClass().getSimpleName();
        String eatName = eat.getClass().getSimpleName();
        System.out.println(String.format("Is %s can eat %s ? Answer: %s", eaterName, eatName, answer));
    }
}
