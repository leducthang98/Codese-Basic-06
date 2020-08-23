package view;

import controller.BookController;
import model.DTO.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    BookController bookController = new BookController();
    Scanner sc = new Scanner(System.in);

    public void execute() {
        while (true) {
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("0.Exit");
            int inputUser = sc.nextInt();
            sc.nextLine();
            switch (inputUser) {
                case 1:
                    ArrayList<Book> allBooks = bookController.getAllBooks();
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(allBooks.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Nhap ten");
                    String name = sc.nextLine();
                    System.out.println("Nhap gia:");
                    int price = sc.nextInt();
                    sc.nextLine();
                    Book book = new Book(name, price);
                    boolean response = bookController.addBook(book);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;
                case 3:
                    //delete
                default:
                    return;
            }
        }

    }

}
