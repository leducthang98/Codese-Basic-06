package Controller;

import Model.DAO.BookDAO;
import Model.DTO.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {
    private static final BookController INSTANCE
            = new BookController();
    BookDAO bookDAO = new BookDAO();

    private BookController() {

    }

    public static BookController getInstance() {
        return INSTANCE;
    }

    public ArrayList<Book> getAllBook() {
        ArrayList<Book> listBook = new ArrayList<>();
        try {
            listBook = bookDAO.getAllBook(); // mess : thanh cong
        } catch (Exception e) {
            // mess: that bai
        } finally {
            return listBook;
        }
    }

}
