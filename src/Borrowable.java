import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

interface Borrowable {
    void borrowItem(String borrowerName);
    void returnItem();
    boolean isAvailable();
    int getBorrowingPeriod();

    default String getBorrowingStatus() {
        return isAvailable() ? "Available for borrowing" : "Currently borrowed";
    }
}

