package under.dog.bodyworld;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherburns on 9/13/16.
 */
public class MouthTest {

    @Test
    public void chewTest(){
        Food food1 = new Food();
        Mouth mouth = new Mouth();
        Food[] expected = new Food[3];
        Food[] actual = mouth.chew(food1);
        Assert.assertEquals("the size of the array should be 3", expected.length, actual.length);
    }
}
