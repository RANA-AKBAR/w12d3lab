package vehicle;
import org.junit.Before;
import org.junit.Test;
import vehicles.Motorcycle;

import static org.junit.Assert.assertEquals;

public class MotorcycleTest {

    Motorcycle motorcycle;

    @Before
    public void setUp(){
        motorcycle = new Motorcycle("blue", "ford", 180, 5, 18000);
    }

    @Test
    public void canStart(){
        assertEquals("Vroom!", motorcycle.start());
    }

    @Test
    public void canStop(){

        assertEquals("click.",motorcycle.stop());
    }
    @Test
    public void canDrive(){
        assertEquals("Vroooooooooom!!", motorcycle.drive());
    }


}
