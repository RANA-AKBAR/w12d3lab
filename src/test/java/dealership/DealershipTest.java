package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;


    @Before
    public void setUp(){
        dealership = new Dealership("Bobs Stuff");
    }

    @Test
    public void canGetName(){
        assertEquals("Bobs Stuff", dealership.getName());
    }
}
