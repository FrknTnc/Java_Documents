public class Main {

    public static void main(String[] args) {

        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();

        double kredi = ogretmenKrediManager.hesapla(1000);
        System.out.println("Kredi: "+kredi);*/

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new TarımKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
