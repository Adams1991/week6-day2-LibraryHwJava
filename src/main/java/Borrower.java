import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> book;

    public Borrower() { this.book = new ArrayList<>();}


    public int BookCount() { return this.book.size();
    }

    public void addBook(Book book) { this.book.add(book);
    }
}
