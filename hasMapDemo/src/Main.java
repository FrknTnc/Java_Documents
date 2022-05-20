import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<String,String>();  // STRING YERİNE INT,CLASS OLABİLİR

        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("red","kırmızı");

        System.out.println(sozluk.size());

        for(String item:sozluk.keySet())  // SIRAYLA GETİRMEZ.
            System.out.println(item);

        for(String item:sozluk.keySet())  // SIRAYLA GETİRMEZ.
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));

        System.out.println(sozluk);
        System.out.println(sozluk.get("book"));

        sozluk.remove("book");
        System.out.println(sozluk.get("book"));

        // sozluk.clear(); // TÜM ELEMANLARI SİLER.
    }
}
