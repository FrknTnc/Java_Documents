import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer silinecek =  new Customer(1,"Furkan","Tunc"); // REFERANS TİPLİ NEW LENİP SİLİNMEZ, BU ŞEKİLDE SİLİNİR.

        customers.add(silinecek);
        customers.add(new Customer(2,"Erkan","Tunc"));
        customers.add(new Customer(3,"Eymen","Tunc"));

        for(Customer customer:customers)
            System.out.println(customer.firstName);

        customers.remove(silinecek);
        for(Customer customer:customers)
            System.out.println("New List: "+customer.firstName);
    }
}
