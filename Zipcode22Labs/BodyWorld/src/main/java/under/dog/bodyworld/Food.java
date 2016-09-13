package under.dog.bodyworld;

/**
 * Created by christopherburns on 9/13/16.
 */
public class Food {
    public int protein;
    public int carb;
    public int waste;

    public Food(){
        protein = 30;
        carb = 30;
        waste = 30;
    }

    public Food(int proteinIn, int carbIn, int wasteIn){
        protein = proteinIn;
        carb = carbIn;
        waste = wasteIn;
    }
}
