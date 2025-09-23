public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library();
        System.out.println("☰ Library Management System ☰");
        System.out.println("");
        System.out.println("Adding books to library...");
        try {
            Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
            Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
            Book book3 = new Book("Web Development", "Mike Johnson", "5555566677", 2021); // 10-digit ISBN

            myLibrary.addBook(book1);
            myLibrary.addBook(book2);
            myLibrary.addBook(book3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating a book: " + e.getMessage());
        }

        myLibrary.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        myLibrary.borrowBook("1234567890");

        System.out.println("\nTrying to borrow Java Programming again...");
        myLibrary.borrowBook("1234567890");

        myLibrary.displayAvailableBooks();

        System.out.println("\nReturning Java Programming...");
        myLibrary.returnBook("1234567890");

        System.out.println("\nTesting validation...");
        try {
            Book invalidBook1 = new Book("Ancient Texts", "Old Author", "1112223334", 1200);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year provided. " + e.getMessage());
        }

        try {
            Book invalidBook2 = new Book("Modern Tech", "New Author", "12345", 2024);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ISBN. " + e.getMessage());
        }
    }
}