
public class Main {
    public static void main(String[] args){
        Book book1 = new Book ("The Legend of Korra", "Marie Buen", 100, false);
        Book book2 = new Book ("Avatar: The Last Airbender", "Buen the great", 100, true);
        Book book3 = new Book ("Citrus", "Bayot", 100, true);

        book1.displayBookInfo();
        book1.checkIfBookIsAvailable();
        System.out.println();

        book2.displayBookInfo();
        book2.checkIfBookIsAvailable();
        System.out.println();

        book3.displayBookInfo();
        book3.checkIfBookIsAvailable();
        System.out.println();

    }
}