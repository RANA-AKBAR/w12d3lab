package components;

public class Tyres extends Component{

    private int size;

    public Tyres(String make, int size){
        super(make);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
