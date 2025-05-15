package Concept.LibraryManagementSystemLowLevelDesignProblem;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Patron {

    private String patronId;
    private String name;
    private String email;
    private String phoneNumber;

    public List<BorrowRecord> getBorrowHistory() {
        return borrowHistory;
    }

    public void setBorrowHistory(List<BorrowRecord> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    private List<Book> borrowedBooks;
    private List<BorrowRecord> borrowHistory;

    public Patron(String patronId, String name, String email, String phoneNumber, List<Book> borrowedBooks, List<BorrowRecord> borrowHistory) {
        this.patronId = patronId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = borrowedBooks;
        this.borrowHistory = borrowHistory;
    }



    public void addBorrowRecord(BorrowRecord record) {
        borrowHistory.add(record);
    }

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
