
public class Truck extends Vehicle {
    private boolean AC, container, handBrake;
    private String sound;
    private int engine;

    public Truck (String model, int make, int numberOfWheels, int topSpeed, boolean AC, boolean container, boolean handBrake, String sound, int engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.container = container;
        this.handBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
    }

    //Getters
    public boolean getAC() {
        return AC;
    }

    public boolean getContainer() {
        return container;
    }

    public boolean getHandBrake() {
        return handBrake;
    }

    public String getSound() {
        return sound;
    }

    public int getEngine() {
        return engine;
    }

    //Setters

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public void setContianer(boolean container) {
        this.container = container;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setEngine (int engine) {
        this.engine = engine;
    }

    public void getTruckInfo() {
        System.out.println("--Truck--");
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number Of Wheels: " + this.getNumberOfWheels());
        System.out.println("Top Speed: " + this.getTopSpeed());
        System.out.println("A/C: " + this.getAC());
        System.out.println("Container: " + this.getContainer());
        System.out.println("Sound: " + this.getSound());
        System.out.println("Engine: " + this.getEngine() + "\n");
    }

    public void openContainer() {
        if (this.container == true) {
            System.out.println("You have opened your container!");
        }
        else {
            System.out.println("You don't have a container!");
        }
    }

    public void Break() {
        System.out.println("You stepped on the brake pedal!");
    }

    public void accelerate() {
        System.out.println ("You have accelerated!");
    }

    public void handBrake() {
        if (this.handBrake == true) {
            System.out.println("You have pulled your handbrake!\n\n");
        } else {
            System.out.println("You don't have a handbrake!\n\n");
        }
    }

}