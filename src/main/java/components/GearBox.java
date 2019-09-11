package components;

public class GearBox extends Component {

    private boolean auto;
    private int gears;

    public GearBox(String make, boolean auto, int gears){
        super(make);
        this.auto = auto;
        this.gears = gears;
    }

    public boolean isAuto() {
        return auto;
    }

    public int getGears() {
        return gears;
    }
}
