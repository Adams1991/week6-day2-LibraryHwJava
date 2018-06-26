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
        if(this.capacity > shelf.size()){
            this.shelf.add(book);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void emptyShelf() {
        this.shelf.clear();
    }

    public Book removeBook() {
        return this.shelf.remove(0);
    }
}
