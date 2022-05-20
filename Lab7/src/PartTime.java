public class PartTime extends Employee{

    double hourlyRate;
    double hoursWorked;

    public PartTime(int id, String name, String surname, double hourlyRate, double hoursWorked){
        super(id, name, surname);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;


    }

    public double pay(){

        return hoursWorked*hourlyRate;
    }

    public String getInformation(){

        return " Id: "+id+" Name: "+name+" Surname: "+surname+" Hourly Rate: "+ hourlyRate+" Hours Worked: "+hoursWorked;
    }
}
