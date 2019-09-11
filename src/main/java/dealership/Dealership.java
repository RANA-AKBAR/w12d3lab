package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;



public class Dealership {

    private ArrayList<Vehicle> vehicles;
    private String name;

    public Dealership(String name){
        this.vehicles = new ArrayList<Vehicle>();
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public String getName(){
        return this.name;
    }

}
