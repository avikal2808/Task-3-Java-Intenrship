
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Book> issuedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return id + " - " + name + " (Books issued: " + issuedBooks.size() + ")";
    }
}
