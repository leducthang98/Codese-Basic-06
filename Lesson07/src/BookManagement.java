import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement { // DAO : Data Access Object
    ArrayList<Book> library = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();

    public void showLib() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).toString());
        }
    }

    public boolean addBook(Book book) {
        try {
            library.add(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateBook(String nameOldBook, Book newBook) {
        int indexOfBook = -1;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(nameOldBook)) {
                indexOfBook = i;
            }
        }
        if (indexOfBook == -1) {
            return false;
        } else {
            library.set(indexOfBook, newBook);
            return true;
        }
    }

    public int deleteBook(String nameBook) { // 1: Thanh cong, -1: Xoa that bai, 0: Khong tim thay sach
        Book book = new Book();
        boolean isBookExist = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(nameBook)) {
                book = library.get(i);
                isBookExist = true;
            }
        }
        if (isBookExist) { //co ton tai sach co ten la nameBook
            boolean response = library.remove(book);
            if (response) {
                return 1; // ton tai sach, xoá thanh cong
            } else {
                return -1; // ton tai sach, xoa that
            }
        } else {
            return 0; // khong ton tai sach
        }
    }

    public boolean isExistBook(String nameOfBook) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(nameOfBook)) {
                return true;
            }
        }
        return false;
    }

    //    public ArrayList<Book> sortByPrice() {
//        ArrayList<Book> books = library;
//
//    }
    public ArrayList<String> filterBook() {
        for (int i = 0; i < library.size(); i++) {
            String currentBookType = library.get(i).getType();
            boolean isNewType = true;
            for (int j = 0; j < type.size(); j++) {
                if (currentBookType.equals(type.get(j))) {
                    isNewType = false;
                }
            }
            if (isNewType) {
                type.add(currentBookType);
            }
        }
        return type;
    }


}
