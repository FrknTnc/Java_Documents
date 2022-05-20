/* public class Main {

    public static void main(String[] args) {

        // System.out.println("Hello Java");
        // System.out.println("I^m learning Java now.");

         float number = 9.5F;
        String str = "Student number: ";

        System.out.println(str +number);
        System.out.println(str +(number+1));
        System.out.println("Student number: 9");
        System.out.println("Student number: 9");

        boolean isstrue=true;

        if(isstrue==true)
            System.out.println("It is true");
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        int sayi = 19;
        if(sayi < 20 )
            System.out.println("Sayı 20 den küçüktür.");
        else if(sayi==20)
            System.out.println("20 ye eşittir.");
        else
            System.out.println("20 den küçük değildir");
    }
}
*/

/*
public class Main{

    public static void main(String[] args){

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        int sayiB = 0;

        if(sayi1>sayi2){
            sayiB = sayi1;
            if(sayi1>sayi3)
                sayiB = sayi1;
            if(sayi1<sayi3)
                sayiB = sayi3;
        }

        if(sayi1<sayi2){
            sayiB = sayi2;
            if(sayi2>sayi3)
                sayiB = sayi2;
            if(sayi2<sayi3)
                sayiB = sayi3;
        }
        System.out.println("Big number is: "+sayiB);
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {
        char grade = 'H';

        switch (grade) {
            case 'A':
                System.out.println("Congratulations!");
                break;
            case 'B':
                System.out.println("Nice");
                break;
            case 'F':
                System.out.println("Kaldınız...");
                break;
            default:
                System.out.println("Yanlış girdiniz.");
        }
    }
}
*/

/*
public class Main{

    public static void main(String[] args){

        for(int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngü bitti.");

        int i=0;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngü bitti.");

        String j=0;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
    }
}
*/

/*
public class Main{

    public static void main(String[] args){

        String[] students = new String[3];

        students[0] = "Furkan";
        students[1] = "Ali";
        students[2] = "Tunc";

        for(int i=0;i< students.length;i++)
        {
            System.out.println(students[i]);
        }
        System.out.println("******************************");

        for(String student:students){
            System.out.println(student);
        }
    }
}
*/

/*
public class Main{

    public static void main(String[] args){

        double[] myList = {1.2,3.4,5.6};

        double total = 0;

        double max = myList[0];

        for(double number:myList){
            if(number>max)
                max = number;
            System.out.println(number);
            total += number;
        }
        System.out.println("Total is: " + total);
        System.out.println("Max number is: " + max);
    }
}
*/

/*
public class Main{

    public static void main(String[] args) {

        String[][] citys = new String[2][2];

        citys[0][0] = "Ahmet";
        citys[0][1] = "Ali";
        citys[1][0] = "Ayse";
        citys[1][1] = "Fatma";

        for(int i=0;i<2;i++){
            System.out.println("**************************");

            for(int j=0;j<2;j++)
                System.out.println(citys[i][j]);
        }
    }
}
*/

/*
public class Main{

    public static void main(String[] args){

        String text = "The weather is very good.";
        System.out.println(text);

        /*
        System.out.println("Eleman sayısı: "+text.length());

        System.out.println("5.eleman: "+text.charAt(4));

        System.out.println(text.concat(" Very cool!"));

        System.out.println(text.startsWith("A"));

        System.out.println(text.endsWith("."));

        char[] characters = new char[3];
        text.getChars(0,3,characters,0);
        System.out.println(characters);

        System.out.println(text.indexOf("er"));

        System.out.println(text.lastIndexOf("er"));


        String newText = text.replace(' ','-');
        System.out.println(newText);

        System.out.println(text.substring(5));
        System.out.println(text.substring(5,8));

        System.out.println("*******************");
        for (String vocab : text.split(" "))
            System.out.println(vocab);

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println(text.trim());

    }
}

*/

/*
public class Main {

    public static void main(String[] args){

        int number = 23;
        int remainder = number%2;

        boolean isPrime = true;

        for(int i =2; i<number ; i++){
            if(number % i ==0)
                isPrime = false;
        }

        if(isPrime==true)
            System.out.println("Asal Sayidir.");

        if(isPrime==false)
            System.out.println("Asal degildir.");
    }
}

*/

/*

public class Main {
    public static void main(String[] args) {

        String harf = "A";

        switch (harf.toLowerCase()){

            case "a":
            case "ı":
            case "o":
            case "u":
                System.out.println("Kalın harf");
                break;
            default:
                System.out.println("İnce harf");
                break;
        }
    }
}
*/

/*
public class Main {

    public static void main(String[] args){

        int number = 28;
        int total = 0;

        for(int i=1 ; i<number ; i++){

            if(number % i ==0){

                total += i;
            }
        }
        if(total == number)
            System.out.println("Mukemmel sayi");
        else
            System.out.println("Mukemmel degil.");
    }
}

*/

/*
public class Main {

    public static void main(String[] args){

        int number1 = 1184;
        int number2 = 1210;
        int total1 = 0;
        int total2 = 0;

        for(int i=1; i<number1; i++){
            if(number1 % i ==0){
                total1 += i;
            }
        }

        for(int j=1; j<number2; j++){
            if(number2 % j ==0){
                total2 += j;
            }
        }

        if(number2 == total1){
            if(number1 == total2){
                System.out.println("Number 1: "+number1+" ve Number 2: "+number2+" arkadaştır.");
            }

        }
        else
            System.out.println("Arkadaş değildir.");
    }
}
*/

/*
public class Main {

    public static void main(String[] args){

        int[] numbers = new int[]{1,2,5,7,9,0};
        int find = 5;

        for(int number: numbers){

            if(number==find)
                System.out.println("This number detected."+number);
        }
    }
}
*/

//Methods

/*
public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){

        int[] numbers = new int[]{1,2,5,7,9,0};
        int find = 7;

        for(int number: numbers){

            if(number==find)
                System.out.println("This number detected."+number);

        }
        System.out.println("*****************");

        output("This number detected..."+find);
    }

    public static void output(String mesaj){

        System.out.println(mesaj);

    }
}
*/

/*
public class Main {

    public static void main(String[] args){
        int total = topla(5,7);
        System.out.println("Total: "+total);

        String yaz = yaz();
        System.out.println(yaz);

        int total2 = topla2(2,3,1,4,5,6,7,8,9);
        System.out.println(total2);
    }

    public static int topla(int number1,int number2){

        return number1 + number2;
    }

    public static String yaz(){
        return "Merhaba Dünya";
    }

    public static int topla2(int... numbers){
        int total=0;

        for(int number: numbers){
            total += number;
        }
        return total;
    }
}
*/

/*public class Main {

    public static void main(String[] args){

        CustomerManager newCustomerManager = new CustomerManager();

        CustomerManager newCustomerManager2 = new CustomerManager();

        newCustomerManager.Add();
        newCustomerManager.Remove();
        newCustomerManager.Update();

        newCustomerManager2.Add();
    }
}*/

/*public class Main {

    public static void main(String[] args){

        Hesaplama4islem hesapMak = new Hesaplama4islem();

        int sonuc = hesapMak.toplama(4,7);
        System.out.println(sonuc);
    }
}*/

/*
public class Main {
    public static void main(String[] args){

    Product product = new Product(2,"Asus K43","Laptop",5000.00);
    product.setId(1);
    product.setDestription("Asus K32");
    product.setName("Laptop");
    product.setPrice(5000.00);

    System.out.println(product.getDestription());

    ProductManager productManager = new ProductManager();

    productManager.Add(product);

    System.out.println(product.getKod());


    }
}
*/

/*public class Main {

    public static void main(String[] args){

        DortIslem dortIslem = new DortIslem();
        System.out.println("Toplam 1 : "+ dortIslem.topla(2,5));

        System.out.println("Toplam 2 : "+ dortIslem.topla(2,7,3));
    }
}*/

/*public class Main {
    public static void main(String[] args){

        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();



    }
}*/

/*public class Main {

    public static void main(String[] args){

        *//*TarimKrediManager tarimKrediManager = new TarimKrediManager();
        TeacherKrediManager teacherKrediManager = new TeacherKrediManager();*//*

        KrediUI krediUI = new KrediUI();

        krediUI.KrediHesapla(new TeacherKrediManager());

    }
}*/

// SON INHERITANCE //