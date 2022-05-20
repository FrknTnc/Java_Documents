public class Main {

    public static void main(String[] args) {

        Bus bus = new Bus();

        bus.numberOfPassengers = 4;
        bus.lineNumber = 4;
        bus.plateNumber = "42 GS 42";
        bus.numberOfSeats = 4;
        bus.model = "Audi";
        bus.year = 2022;
        bus.numberOfWheels = 6;
        bus.getOn();
        System.out.println("Tax: "+bus.calculateTax(100));
        bus.printDetails();

        Truck truck = new Truck();
        truck.printDetails();

        Automobile automobile = new Automobile();
        automobile.printDetails();

        Bicycle bicycle = new Bicycle();
        bicycle.printDetails();
    }
}
