package vehicle;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar Ecar;

    @Before
    public void setUp(){
        Ecar = new ElectricCar("blue", "ford", 180, 5, 18000);
    }

    @Test
    public void canStart(){
        assertEquals("Vroom!", Ecar.start());
    }

    @Test
    public void canStop(){

        assertEquals("click.",Ecar.stop());
    }
    @Test
    public void canDrive(){
        assertEquals("Vroooooooooom!!", Ecar.drive());
    }


}
