
public class Bike extends Vehicle {
    private int engine;

    public Bike (String model, int make, int numberOfWheels, int topSpeed, int engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void getBikeInfo() {
        System.out.println("--Bike--");
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number Of Wheels: " + this.getNumberOfWheels());
        System.out.println("Top Speed: " + this.getTopSpeed());
        System.out.println("Engine: " + this.getEngine() + "\n");
    }

    public void Break() {
        System.out.println("You pulled the brake!\n\n");
    }

    public void accelerate() {
        System.out.println("You're going faster!");
    }
    
}