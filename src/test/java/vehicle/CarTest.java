package vehicle;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void setUp(){
        car = new Car("blue", "ford", 180, 5, 18000);
    }

    @Test
    public void canStart(){
        assertEquals("Vroom!", car.start());
    }

    @Test
    public void canStop(){
        assertEquals("click.",car.stop());
    }
    @Test
    public void canDrive(){
        assertEquals("Vroooooooooom!!", car.drive());
    }


}
