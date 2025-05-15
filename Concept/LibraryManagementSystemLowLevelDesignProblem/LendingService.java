package Concept.LibraryManagementSystemLowLevelDesignProblem;

import java.time.LocalDate;
import java.util.UUID;

public class LendingService {

    private Library library;

    public LendingService(Library library) {
        this.library = library;
    }

    public boolean borrowBook(String patronId, int bookId) {
        Patron patron = findPatronById(patronId);
        Book book = findBookById(bookId);

        if (patron == null || book == null || !book.isAvailable()) {
            System.out.println("Borrow failed: invalid patron or book unavailable.");
            return false;
        }

        book.setAvailable(false);
        patron.getBorrowedBooks().add(book);

        String recordId = UUID.randomUUID().toString();
        LocalDate borrowDate = LocalDate.now();
        LocalDate dueDate = borrowDate.plusWeeks(2);

        BorrowRecord record = new BorrowRecord(recordId, book, borrowDate, dueDate);
        patron.getBorrowHistory().add(record);

        return true;
    }

    public boolean returnBook(String patronId, int bookId) {
        Patron patron = findPatronById(patronId);
        Book book = findBookById(bookId);

        if (patron == null || book == null || !patron.getBorrowedBooks().contains(book)) {
            System.out.println("Return failed: book not found in patron's borrowed list.");
            return false;
        }

        book.setAvailable(true);
        patron.getBorrowedBooks().remove(book);

        for (BorrowRecord record : patron.getBorrowHistory()) {
            if (record.getBook().equals(book) && record.getReturnDate() == null) {
                record.setReturnDate(LocalDate.now());
                break;
            }
        }

        return true;
    }

    private Patron findPatronById(String patronId) {
        for (Patron p : library.getPatrons()) {
            if (p.getPatronId().equals(patronId)) {
                return p;
            }
        }
        return null;
    }

    private Book findBookById(int bookId) {
        for (Book b : library.getBooks()) {
            if (b.getBookId() == bookId) {
                return b;
            }
        }
        return null;
    }
}
