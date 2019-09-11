package dealership;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;


    @Before
    public void setUp(){
        dealership = new Dealership("Bobs Stuff");
        car = new Car("Blue", "Ford", 180, 5, 20000);
    }

    @Test
    public void canGetName(){
        assertEquals("Bobs Stuff", dealership.getName());
    }

    @Test
    public void canAddCarToAllStock(){
        dealership.addVehicleToAllStock(car);
        assertEquals(1, dealership.getAllStockSize());

    }

    @Test
    public void canAddCarToRentedVehicles(){
        dealership.addVehicleToRentedVehicles(car);
        assertEquals(1, dealership.getRentedVehicleSize());
    }

    @Test
    public void canAddCarToSoldVehicles(){
        dealership.addVehicleToSoldVehicles(car);
        assertEquals(1, dealership.getSoldVehiclesSize());
    }
}
