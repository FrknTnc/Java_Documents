public class ProductValidator {

    static{
        System.out.println("Static Yapıcı Blok Çalıştı.");
    }

    public ProductValidator(){
        System.out.println("newlendiyse bu yazı ekrana yazar.");
    }

    public static boolean isValid(Product product){

        if(product.price > 0 && !product.name.isEmpty())
            return true;
        else
            return false;

    }

    public static class NewClass{
        public static void sil(){

        }
    } // inner class
}
