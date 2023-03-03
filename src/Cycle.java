public class Cycle extends Vehicle{

    public Cycle (String model, int make, int numberOfWheels, int topSpeed) {
        super(model, make, numberOfWheels, topSpeed);
    }

    public void getCycleInfo() {
        System.out.println("--Cycle--");
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number Of Wheels: " + this.getNumberOfWheels() + "\n\n");
    }
}
