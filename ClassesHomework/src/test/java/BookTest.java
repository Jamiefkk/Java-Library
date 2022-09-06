import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    @Before
    public void setup(){
        book = new Book("LOTR","Fantasy","JRR");
    }
    @Test
    public void bookHasName(){
        assertEquals("LOTR", book.getName());
    }    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }    @Test
    public void bookHasAuthor(){
        assertEquals("JRR", book.getAuthor());
    }
}
