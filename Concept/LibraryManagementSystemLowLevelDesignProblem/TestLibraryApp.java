package Concept.LibraryManagementSystemLowLevelDesignProblem;

import java.util.*;

public class TestLibraryApp {
    public static void main(String[] args) {
        // Setup books
        Book book1 = new Book(1, "Clean Code", "Robert Martin", "9780132350884", true, 2008);
        Book book2 = new Book(2, "Effective Java", "Joshua Bloch", "9780134685991", true, 2017);

        // Setup patrons
        Patron patron1 = new Patron("001", "Alice", "ddsds@" , "23232" , new ArrayList<>(), new ArrayList<>());



        // Setup library
        Library library = new Library(new ArrayList<>(Arrays.asList(book1, book2)), new ArrayList<>(List.of(patron1)));

        // Setup Lending Service
        LendingService lendingService = new LendingService(library);

        // Borrow
        System.out.println("Borrowing Book 1:");
        lendingService.borrowBook("P001", 1);

        // Try to borrow unavailable book
        System.out.println("Trying to borrow already borrowed Book 1:");
        lendingService.borrowBook("P001", 1);

        // Return
        System.out.println("Returning Book 1:");
        lendingService.returnBook("P001", 1);

        // Borrow again
        System.out.println("Borrowing Book 1 again:");
        lendingService.borrowBook("P001", 1);

        // Show Patron History
        Patron p = library.getPatrons().get(0);
        System.out.println("\nBorrow History for " + p.getName() + ":");
        for (BorrowRecord record : p.getBorrowHistory()) {
            System.out.println("- Book: " + record.getBook().getTitle() +
                    ", Borrowed: " + record.getBorrowDate() +
                    ", Returned: " + (record.getReturnDate() != null ? record.getReturnDate() : "Not yet"));
        }
    }
}
