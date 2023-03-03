
public class Vehicle {
    private String model;
    private int make;
    private int numberOfWheels;
    private int topSpeed;

    public Vehicle(String model, int make, int numberOfWheels, int topSpeed) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
    }

    public Vehicle() {
        this.model = "Not Assigned";
        this.make = 0000;
        this.numberOfWheels = 4;
        this.topSpeed = 140;
    }

    // Getters

    public String getModel() {
        return model;
    }

    public int getMake() {
        return make;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    //Setters

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }


}
