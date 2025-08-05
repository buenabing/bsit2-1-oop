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

    public void displayBookInfo(){
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + pages);
    }

    public void checkIfBookIsAvailable() {
        if (isAvailable) {
            System.out.println("Book is available");
        } else {
            System.out.println("Book is not available");
        }
    }
}