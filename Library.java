// Library.java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book b) { books.add(b); }
    public void addUser(User u) { users.add(u); }

    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);
        if (book != null && user != null && !book.isIssued()) {
            book.issueBook();
            user.issueBook(book);
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Cannot issue book.");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);
        if (book != null && user != null && book.isIssued()) {
            book.returnBook();
            user.returnBook(book);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Cannot return book.");
        }
    }

    private Book findBook(int id) {
        for (Book b : books) if (b.getId() == id) return b;
        return null;
    }

    private User findUser(int id) {
        for (User u : users) if (u.getId() == id) return u;
        return null;
    }

    public void showAllBooks() {
        for (Book b : books) System.out.println(b);
    }

    public void showAllUsers() {
        for (User u : users) System.out.println(u);
    }
}
