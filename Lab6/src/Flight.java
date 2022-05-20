public class Flight {

    String flightNumber;
    String destination;
    Time depart;
    Time arrival;
    Date flightDate;
    int MAX_CAPACITY = 100;
    Passenger[] passengerList;

    int numberOfPassengers = 0;

    public Flight (String flightNumber, String destination, Time departTime, Time arrivalTime, Date flightDate){

        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depart = departTime;
        this.arrival = arrivalTime;
        this.flightDate = flightDate;
        passengerList = new Passenger[MAX_CAPACITY];
    }

    public void addPassenger(Passenger passenger){

        passengerList[numberOfPassengers] = passenger;
        numberOfPassengers += 1;

    }

    public void displayInformation(){

        System.out.println("Flight Number : "+ this.flightNumber);
        System.out.println("Destination : "+ this.destination);
        System.out.println("Departure Time : "+ this.depart.hour + ":" + this.depart.minute);
        System.out.println("Arrival Time : "+ this.arrival.hour + ":" + this.arrival.minute);
        System.out.println("Date : "+ this.flightDate.day + "/" + this.flightDate.month + "/" + this.flightDate.year);
        System.out.println("Number of Passengers : "+ this.numberOfPassengers);

    }


}
