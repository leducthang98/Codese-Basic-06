package Controller;


import Model.DAO.BookDAO;
import Model.DTO.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookController {
    BookDAO bookDAO = new BookDAO();
    private static final BookController INSTANCE = new BookController();

    private BookController() {

    }

    public static BookController getInstance() {
        return INSTANCE;
    }

    public ArrayList<Book> getAllBooks() {
        try {
            return bookDAO.getAllBooks();
        } catch (SQLException e) {
            return null;
        }
    }
}
