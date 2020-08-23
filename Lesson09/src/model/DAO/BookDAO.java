package model.DAO;

import model.DTO.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    // Gia su no co ket noi toi DB roi
    ArrayList<Book> library = new ArrayList<>();

    public BookDAO() {
        Book defaultBook = new Book("BookA", 1000);
        library.add(defaultBook);
    }

    public ArrayList<Book> getAllBooks() {
        return library;
    }


    public boolean addBook(Book b) {
        return library.add(b);
    }


}
