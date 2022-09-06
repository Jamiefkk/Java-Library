import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void setUp(){
        library = new Library(4);
        book = new Book("LOTR","Fantasy","JRR");
    }
    @Test
    public void libraryHasCapacity(){
        assertEquals(4,library.getCapacity());
    }
    @Test
    public void libraryHasBooks(){
        library.addBookToLibrary(book);
        assertEquals(1,library.getLibraryBookCount());
    }    @Test
    public void libraryCantAddBooksIfCapacityBreached(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(4,library.getLibraryBookCount());
    }
}
