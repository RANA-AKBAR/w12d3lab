package vehicles;

import components.Component;

import java.util.ArrayList;

public abstract class Vehicle {

    private String colour;
    private String model;
    private int topSpeed;
    private int capacity;
    private int price;
    private ArrayList<Component> components;

    public Vehicle(String colour, String model, int topSpeed, int capacity, int price){
        this.colour = colour;
        this.model = model;
        this.topSpeed = topSpeed;
        this.capacity = capacity;
        this.price = price;
        this.components = new ArrayList<Component>();

    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public String start(){
        return "Vroom!";
    }

    public String stop(){
        return "click.";
    }

    public String drive(){
        return "Vroooooooooom!!";
    }
}
