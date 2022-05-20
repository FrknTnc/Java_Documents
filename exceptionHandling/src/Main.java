/*
public class Main {

    public static void main(String[] args) {

        try{
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        } catch (Exception exception) {
            System.out.println(exception);
        }finally {
            System.out.println("Ben her türlü çalışırım.");
        }
    }
}
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {  //TRY CATCH İÇİNE AL ALMAZSAN FIRLATIR DİYE UYARI VERMEN GEREK.

        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\exceptionHandling\\src\\sayilar.txt"));

            String line = null;

            while((line = reader.readLine()) != null ){
                total +=  Integer.valueOf(line);
            }
            System.out.println(total);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            try{
                reader.close();
            }catch (Exception exception){

            }

        }
    }
}

