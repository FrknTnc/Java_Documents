import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number of employees: ");
        Scanner numbers = new Scanner(System.in);
        int number = numbers.nextInt();
        Employee[] employees = new Employee[number];

        for (int i=0; i < number; i++){

            System.out.println("Enter id of employee"+i+": ");
            Scanner ids = new Scanner(System.in);
            int id = ids.nextInt();
            System.out.println("Enter name of employee"+i+": ");
            Scanner names = new Scanner(System.in);
            String name = names.next();
            System.out.println("Enter surname of employee"+i+": ");
            Scanner surnames = new Scanner(System.in);
            String surname = surnames.next();
            System.out.println("Enter either 'f' for full time or 'p' for part-time: ");
            Scanner types = new Scanner(System.in);
            String type = types.next();

            if( type.equals("p")){
                System.out.println("Enter hourly rate of employee"+i+": ");
                Scanner hourlyRates = new Scanner(System.in);
                double hourlyRate = hourlyRates.nextDouble();
                System.out.println("Enter number of worked"+i+": ");
                Scanner hoursWorkeds = new Scanner(System.in);
                double hoursWorked = hoursWorkeds.nextDouble();
                employees[i] = new PartTime(id, name, surname, hourlyRate,hoursWorked);
                }
            if(type.equals("f")){
                System.out.println("Enter salary of employee"+i+": ");
                Scanner salarys = new Scanner(System.in);
                double salary = salarys.nextDouble();
                employees[i] = new FullTime(id, name, surname, salary);
                }

            }

        for (int i=0; i < number; i++){
            System.out.println(employees[i].getInformation());
        }
    }
}
