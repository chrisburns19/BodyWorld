package under.dog.bodyworld;

/**
 * Created by christopherburns on 9/13/16.
 */
public class Stomach {
    Food apple = new Food();
    public int digestFood(Food food){

        int energy = (apple.protein + apple.carb)/2;

        return energy;
    }

}

