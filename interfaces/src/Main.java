public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

        /*CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
        customerManager.add();*/


    }
}
