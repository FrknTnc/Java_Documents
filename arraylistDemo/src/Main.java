import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* int[] sayilar = new int[]{1,2,3};
        sayilar = new int[4]; // DİZİLERDE NEW YENİDEN DİZİ OLUŞTURUR, KOLEKSİYONDA ÜSTÜNE EKLEME YAPAR.
        System.out.println(sayilar[0]); */

        ArrayList sayilar = new ArrayList();
        System.out.println("İlk size: "+sayilar.size());

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add("Ankara");

        System.out.println("Son size: "+sayilar.size());
        System.out.println("3.Değer: "+sayilar.get(2));

        // sayilar.set(0,"İstanbul");
        System.out.println("1.Değer: "+sayilar.get(0));

        // REMOVE değer gidiyor, liste kayıyor.
        // sayilar.remove(0);
        // System.out.println("Remove sonrası 1.Değer: "+sayilar.get(0));
        // System.out.println("Remove sonrası size: "+sayilar.size());

        // sayilar.clear(); // TÜM ELEMANLARI SİLER.

        for(Object i:sayilar){  // OBJE OLARAK TUTAR.
            System.out.println(i);
        }

    }
}
