import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(GenreType.HORROR);
    }

    @Test
    public void canGetGenre(){
        assertEquals(GenreType.HORROR, book.getGenre());
    }

    @Test
    public void bookHasDescription(){
        assertEquals("Scary", book.getValueFromEnum());
    }

}
