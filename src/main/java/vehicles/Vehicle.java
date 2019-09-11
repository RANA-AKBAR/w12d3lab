package vehicles;

public abstract class Vehicle {

    private String colour;
    private String model;
    private int topSpeed;
    private int capacity;
    private int price;

    public Vehicle(String colour, String model, int topSpeed, int capacity, int price){
        this.colour = colour;
        this.model = model;
        this.topSpeed = topSpeed;
        this.capacity = capacity;
        this.price = price;

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
