public class App {
    public static void main(String[] args) throws Exception {
        
        Truck truck1 = new Truck("Shipping Truck", 2004, 18, 80, true, true, true, "VROOM", 1500);

        Truck truck2 = new Truck("Tipper Truck", 2013, 18, 110, true, false, false, "VROOM", 1000);

        Car newcar = new Car("Mustang", 2014, 4, 190, true, true, "VROOM", 2500);

        Car newcar2 = new Car("Mustang", 2014, 4, 190, true, false, "VROOM", 2500);

        Bike newbike = new Bike("Specialized Tarmac", 2009, 2, 150, 1500);

        Cycle newcycle = new Cycle("six-track FM-based groovebox", 2004, 2, 120);

        truck1.getTruckInfo();
        truck1.openContainer();
        truck1.accelerate();
        truck1.handBrake();

        truck2.getTruckInfo();
        truck2.openContainer();
        truck2.accelerate();
        truck2.handBrake();

        newcar.getCarInfo();
        newcar.accelerate();
        newcar.Break();
        newcar.handBrake();

        newcar2.getCarInfo();
        newcar2.accelerate();
        newcar2.Break();
        newcar2.handBrake();

        newbike.getBikeInfo();
        newbike.accelerate();
        newbike.Break();

        newcycle.getCycleInfo();

    }
}

