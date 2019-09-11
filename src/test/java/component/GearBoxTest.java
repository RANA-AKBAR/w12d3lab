package component;

import components.GearBox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    GearBox gearbox;

    @Before
    public void setUp(){
        gearbox = new GearBox("Sony", true, 5);
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", gearbox.getMake());
    }

    @Test
    public void canGetAuto(){
        assertEquals(true, gearbox.isAuto());
    }

    @Test
    public void canGetGears(){
        assertEquals(5, gearbox.getGears());
    }

}
