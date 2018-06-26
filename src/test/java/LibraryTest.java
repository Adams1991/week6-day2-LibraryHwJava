import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(1);
        book = new Book();
    }

    @Test
    public void shelfStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(1, library.getCapacity());
    }

    @Test
    public void canEmptyShelf() {
        library.addBook(book);
        library.emptyShelf();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void cannotAddWhenFull(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

}


