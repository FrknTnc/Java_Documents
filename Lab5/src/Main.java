public class Main {

    public static void main(String[] args) {

        Book myBook = new Book();

        myBook.book_name = "Kuyucaklı Yusuf";
        myBook.author = "Sabahattin Ali";
        myBook.ISBN_number = 97456;

        Book myBook2 = new Book();

        myBook2.book_name = "Savas ve Baris";
        myBook2.author = "Tolstoy";
        myBook2.ISBN_number = 36541;

        Periodical myPeriodical = new Periodical();

        myPeriodical.periodical_title = "Computer Science";
        myPeriodical.publisher = "ACM";
        myPeriodical.issue_number = 354;

        System.out.println(myBook.getDetails());

        System.out.println(myBook2.getDetails());

        System.out.println(myPeriodical.getDetails());
    }
}
