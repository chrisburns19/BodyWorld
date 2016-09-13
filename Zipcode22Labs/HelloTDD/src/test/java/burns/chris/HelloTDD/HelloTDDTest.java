package burns.chris.HelloTDD;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherburns on 9/8/16.
 */
public class HelloTDDTest {
    @Test
    public void displayMessageTest(){
        HelloTDD helloTDD = new HelloTDD();
        helloTDD.displayMessage();
        Assert.assertEquals("The message returned is equal to cat","cat", helloTDD.displayMessage());
    }
}

