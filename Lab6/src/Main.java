public class Main {

    public static void main(String[] args) {

        Time departTime = new Time(13, 40);
        Time arrivalTime = new Time(14, 50);
        Date date = new Date(9, "APRIL", 2022);
        Flight flight = new Flight("PK-303", "Istanbul", departTime, arrivalTime, date);
        // Passenger passenger = new Passenger("ALi",50);
        flight.addPassenger(new Passenger("Furkan",30));
        flight.displayInformation();

    }
}
