import java.util.ArrayList;

public class Library {

    private ArrayList<Book> shelf;

    public Library() {
        this.shelf = new ArrayList<>();
    }

    public int bookCount() {
        return this.shelf.size();
    }
}
