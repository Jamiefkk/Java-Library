import org.junit.Before;
import org.junit.Test;

public class BorrowerTest {
    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(4);
        book = new Book("LOTR","Fantasy","JRR");
        borrower = new Borrower();
    }
    @Test
    public void checkoutBookToBorrower(){

    }
}
