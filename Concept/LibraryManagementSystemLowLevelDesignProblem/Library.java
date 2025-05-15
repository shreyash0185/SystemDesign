package Concept.LibraryManagementSystemLowLevelDesignProblem;

import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private List<Book> books;
    private List<Patron> patrons;



    public Library(List<Book> books, List<Patron> patrons) {
        this.books = books;
        this.patrons = patrons;
    }

    public List<Book> getAvailableBooks() {
        return books.stream().filter(Book::isAvailable).collect(Collectors.toList());
    }

    public List<Book> getBorrowedBooks() {
        return books.stream().filter(book -> !book.isAvailable()).collect(Collectors.toList());
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == (book.getBookId())) {
                books.set(i, book);
                break;
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }


    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    public void updatePatron(Patron patron) {
        for (int i = 0; i < patrons.size(); i++) {
            if (patrons.get(i).getPatronId() == (patron.getPatronId())) {
                patrons.set(i, patron);
                break;
            }
        }
    }



    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    public void setPatrons(List<Patron> patrons) {
        this.patrons = patrons;
    }
}
