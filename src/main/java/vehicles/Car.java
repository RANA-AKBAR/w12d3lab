package vehicles;

import components.Component;
import components.Engine;

import java.util.ArrayList;

public class Car extends Vehicle {

    ArrayList<Component> components;

    public Car(String colour, String model, int topSpeed, int capacity, int price){
        super(colour, model, topSpeed, capacity, price);
        components = new ArrayList<Component>();
    }

    public int getNumberOfComponents(){
        return components.size();
    }


    public void addComponent(Engine engine) {
        components.add(engine);
    }
}
