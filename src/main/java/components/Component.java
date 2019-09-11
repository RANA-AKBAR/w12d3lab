package components;


public abstract class Component {

    private String make;

    public Component(String make){
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
