public class Library {

    private Book[] books;
    private int bookCount;

    public Library() {
        this.books = new Book[10]; // Maximum 10 books
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null; // Book not found
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable books:");
        boolean foundAvailable = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
                foundAvailable = true;
            }
        }
        if (!foundAvailable) {
            System.out.println("No books are currently available.");
        }
    }

    public void displayAllBooks() {
        System.out.println("\nAll books in library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}