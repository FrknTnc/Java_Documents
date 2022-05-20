public class FullTime extends Employee{

    double salary;

    public  FullTime(int id, String name, String surname, double salary){
        super(id, name, surname);
        this.salary = salary;

    }

    public double pay(){

        return salary;
    }

    public String getInformation(){

        return " Id: "+id+" Name: "+name+" Surname: "+surname+" Salary: "+ salary;
    }
}
