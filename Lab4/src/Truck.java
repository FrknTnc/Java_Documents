public class Truck extends Vehicle{
    int numberOfSeats;
    int capacity;
    String plateNumber;

    public int getNumAxles(){

        return numberOfSeats/2;
    }

    public int calculateTax(int limit){

        return limit;
    }
    public void printDetails(){

    }

}
