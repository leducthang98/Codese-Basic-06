package View;

import Controller.BookController;
import Model.DTO.Book;

import java.util.ArrayList;
import java.util.List;

public class BookView {
    public void renderView() {
        ArrayList<Book> list = BookController.getInstance().getAllBook();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
