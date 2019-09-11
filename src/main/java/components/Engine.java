package components;

public class Engine extends Component{

    private int power;
    private int mileage;
    private int size;

    public Engine(String make, int power, int mileage, int size){
        super(make);
        this.power = power;
        this.mileage = mileage;
        this.size = size;
    }

    public int getPower() {
        return power;
    }

    public int getMileage() {
        return mileage;
    }

    public int getSize() {
        return size;
    }
}
