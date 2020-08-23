package controller;

import model.DAO.BookDAO;
import model.DTO.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {
    BookDAO bookDAO = new BookDAO();

    public ArrayList<Book> getAllBooks(){
        return bookDAO.getAllBooks();
    }
    public boolean addBook(Book b){
        return bookDAO.addBook(b);
    }
}
