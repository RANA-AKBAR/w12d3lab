package component;

import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyres tyres;

    @Before
    public void setUp(){
        tyres = new Tyres("Firestone", 4);
    }

    @Test
    public void canGetMake(){
        assertEquals("Firestone", tyres.getMake());
    }

    @Test
    public void canGetSize(){
        assertEquals(4, tyres.getSize());
    }

}
