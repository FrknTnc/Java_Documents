public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Iphone 13";
        product.price = 1000;
        productManager.add(product);


        //inner class
        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Crud.Update();
    }
}
