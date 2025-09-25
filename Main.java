// Main.java
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Add some books
        lib.addBook(new Book(1, "Java Basics", "James Gosling"));
        lib.addBook(new Book(2, "OOP Concepts", "Bjarne Stroustrup"));

        // Add users
        lib.addUser(new User(101, "Alice"));
        lib.addUser(new User(102, "Bob"));

        // Show books
        System.out.println("Books in library:");
        lib.showAllBooks();

        // Issue a book
        lib.issueBook(1, 101);

        // Show status
        System.out.println("\nAfter issuing:");
        lib.showAllBooks();

        // Return a book
        lib.returnBook(1, 101);

        // Show status
        System.out.println("\nAfter returning:");
        lib.showAllBooks();
    }
}
