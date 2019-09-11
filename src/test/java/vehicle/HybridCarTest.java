package vehicle;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar Hcar;

    @Before
    public void setUp(){
        Hcar = new HybridCar("blue", "ford", 180, 5, 18000);
    }

    @Test
    public void canStart(){
        assertEquals("Vroom!", Hcar.start());
    }

    @Test
    public void canStop(){

        assertEquals("click.",Hcar.stop());
    }
    @Test
    public void canDrive(){
        assertEquals("Vroooooooooom!!", Hcar.drive());
    }


}
