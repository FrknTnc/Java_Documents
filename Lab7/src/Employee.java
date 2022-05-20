public class Employee {

    public int id;
    public String name;
    public String surname;

    public Employee(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getInformation(){

        return "Id: "+id+" Name: "+name+" Surname: "+surname;
    }
}
