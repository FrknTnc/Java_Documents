public class Bus extends Vehicle {

    int numberOfSeats;
    boolean isElectric;
    int lineNumber;
    String plateNumber;
    int numberOfPassengers;

    public void getOn(){

        isElectric = true;
        System.out.println("Motor Çalıştı");
    }

    public void getOff(){
        isElectric = false;
    }

    public int calculateTax(int limit){

        return limit*2;
    }

    public void printDetails(){

        System.out.println("Model: " + this.model);
        System.out.println("Year: " +this.year);
        System.out.println("Number Of Wheels: " +this.numberOfWheels);
        System.out.println("Plate Number: " +this.plateNumber);
        System.out.println("Line Number: " +this.lineNumber);
        System.out.println("Number Of Seats: " +this.numberOfSeats);


    }



}
