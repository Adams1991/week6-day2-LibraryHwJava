import java.util.ArrayList;

public class Library {

    private ArrayList<Book> shelf;
    private Integer capacity;

    public Library(Integer capacity) {
        this.shelf = new ArrayList<>();
        this.capacity = capacity;
        
    }

    public int bookCount() {
        return this.shelf.size();
    }

    public void addBook(Book book) {
        this.shelf.add(book);
    }

    public int getCapacity() {
        return capacity;
    }

    public void emptyShelf() {
        this.shelf.clear();
    }

    public void reduceCapacity() {
        this.capacity -= 1;
    }
}
