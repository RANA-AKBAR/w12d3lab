package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;



public class Dealership {

    private ArrayList<Vehicle> allStock;
    private ArrayList<Vehicle> rentedVehicles;
    private ArrayList<Vehicle> soldVehicles;
    private String name;

    public Dealership(String name){
        this.allStock = new ArrayList<Vehicle>();
        this.rentedVehicles = new ArrayList<Vehicle>();
        this.soldVehicles = new ArrayList<Vehicle>();
        this.name = name;
    }

    public void addVehicleToAllStock(Vehicle vehicle) {
        this.allStock.add(vehicle);
    }

    public int getAllStockSize(){
        return this.allStock.size();
    }

    public void addVehicleToRentedVehicles(Vehicle vehicle) {
        this.rentedVehicles.add(vehicle);
    }

    public int getRentedVehicleSize(){
       return this.rentedVehicles.size();
    }
    public void addVehicleToSoldVehicles(Vehicle vehicle) {
        this.soldVehicles.add(vehicle);
    }

    public int getSoldVehiclesSize(){
        return this.soldVehicles.size();
    }

    public String getName(){
        return this.name;
    }

}
