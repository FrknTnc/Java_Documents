public class Periodical extends Source{
    String periodical_title;
    String publisher;
    int issue_number;


    @Override
    public String getDetails() {

        System.out.println("Periodical details: ");
        return periodical_title + ", " + publisher + ", " + issue_number;
    }
}
