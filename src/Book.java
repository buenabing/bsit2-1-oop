public class Book {
    String bookTitle = ""; // Changed the name to "bookTitle" from "bookTittle"
    String author = "";
    int pages = 0;
    boolean isAvailable = false;

    // Constructor now correctly takes a boolean for isAvailable
    public Book(String title, String authorOfBook, int pagesOfBook, boolean isBookAvailable) {
        bookTitle = title;
        author = authorOfBook;
        pages = pagesOfBook;
        isAvailable = isBookAvailable;
    }

    public void checkIfBookIsAvailable() {
        if (isAvailable) {
            System.out.println("Book is available");
        } else {
            System.out.println("Book is not available");
        }
    }
}