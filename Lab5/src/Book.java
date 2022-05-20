public class Book extends Source{

    String book_name;
    String author;
    int ISBN_number;


    @Override
    public String getDetails() {

        System.out.println("Book details: ");
        return book_name + ", " + author + ", " + ISBN_number;
    }
}
