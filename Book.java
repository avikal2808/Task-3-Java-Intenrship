// Book.java
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public boolean issueBook() {
        if (!isIssued) {
            isIssued = true;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (isIssued) {
            isIssued = false;
            return true;
        }
        return false;
    }

    public int getId() { return id; }
    public boolean isIssued() { return isIssued; }

    @Override
    public String toString() {
        return id + " - " + title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
    }
}
