import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }
    public ArrayList<Book> getBooks(){
        return bookCollection;
    }
    public void addBookToLibrary(Book book){
        if (getCapacity() > getLibraryBookCount())
        this.bookCollection.add(book);
    }

    public int getCapacity() {
        return capacity;
    }
    public int getLibraryBookCount() {
        return this.bookCollection.size();
    }

    public ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
    public Book removeBook(){
        return this.bookCollection.remove(0);
    }
    public void checkoutBook(Borrower borrower){
        if (this.getLibraryBookCount() > 0){
            borrower.collection.add(bookCollection.removeBook());
        }
    }
}
