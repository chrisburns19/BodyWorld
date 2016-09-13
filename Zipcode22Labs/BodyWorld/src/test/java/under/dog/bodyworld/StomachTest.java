package under.dog.bodyworld;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherburns on 9/13/16.
 */
public class StomachTest {
    @Test
    public void digestFood(){
        Stomach stomach = new Stomach();
        Food food = new Food();
        int expected = 30;
        int actual =stomach.digestFood(food);
        Assert.assertEquals("yo its 30", expected, actual);
    }
}
