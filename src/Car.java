public class Car extends Vehicle{
    private boolean AC, handBrake;
    private String sound;
    private int engine;

    public Car (String model, int make, int numberOfWheels, int topSpeed, boolean AC, boolean handbrake, String sound, int engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.handBrake = handbrake;
        this.sound = sound;
        this.engine = engine;
    }

    //Getters
    public boolean getAC() {
        return AC;
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

    public void setHandBreak(boolean handBrake) {
        this.handBrake = handBrake;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setEngine (int engine) {
        this.engine = engine;
    }

    public void getCarInfo() {
        System.out.println("--Car--");
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number Of Wheels: " + this.getNumberOfWheels());
        System.out.println("Top Speed: " + this.getTopSpeed());
        System.out.println("A/C: " + this.getAC());
        System.out.println("Handbrake: " + this.getHandBrake());
        System.out.println("Sound: " + this.getSound());
        System.out.println("Engine: " + this.getEngine() + "\n");
    }

    public void Break() {
        System.out.println("You stepped on the brake pedal!");
    }

    public void accelerate() {
        System.out.println ("You have accelerated!");
    }

    public void handBrake() {
        if (this.handBrake == true) {
            System.out.println("You have pulled the handbrake!\n\n");
        }
        else {
            System.out.println("You don't have a handbreak!\n\n");
        }
    }

}
