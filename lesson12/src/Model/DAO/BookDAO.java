package Model.DAO;

import Helper.DatabaseUtil;
import Model.DTO.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
    DatabaseUtil databaseUtil = new DatabaseUtil();

    public ArrayList<Book> getAllBooks() throws SQLException {
        String sql = "SELECT * FROM Book";
        ResultSet res
                = databaseUtil.executeQuery(sql);
        ArrayList<Book> bookList = new ArrayList<>();
        while (res.next()) {
            Book temp = new Book();
            temp.setId(res.getInt("id"));
            temp.setName(res.getString("name"));
            temp.setPrice(res.getInt("price"));
            bookList.add(temp);
        }
        return bookList;
    }
}
