package component;

import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine("Aston Martin", 200, 200000, 2);
    }

    @Test
    public void canGetMake(){
        assertEquals("Aston Martin", engine.getMake());
    }

    @Test
    public void canGetPower(){
        assertEquals(200, engine.getPower());
    }

    @Test
    public void canGetMileage(){
        assertEquals(200000, engine.getMileage());
    }

    @Test
    public void canGetSize(){
        assertEquals(2, engine.getSize());
    }



}
