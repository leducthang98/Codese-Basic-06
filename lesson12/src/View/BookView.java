package View;

import Controller.BookController;
import Model.DTO.Book;

import java.util.ArrayList;

public class BookView {
    public void execute() {
        ArrayList<Book> data = BookController.getInstance().getAllBooks();
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }
}
