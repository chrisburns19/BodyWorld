package under.dog.bodyworld;

/**
 * Created by christopherburns on 9/13/16.
 */
public class Mouth {

    public Food[]chew(Food food){
        Food[] processed = new Food[3];
        for(int x=0;x < 3; x++){
            processed[x] = new Food(10,10,10);
        }
        return processed;
    }
}
