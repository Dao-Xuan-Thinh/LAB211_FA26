package view;

import model.Book;

/*
 * ALL TABLE OUTPUT LIVES HERE.
 *
 * The header is written in ONE place. If a column width changes you edit it
 * once and every table in the program stays aligned. That is the reason this
 * class exists instead of scattering println calls around the controller.
 *
 * The widths here MUST match the widths in Book.display(), or the header and
 * the rows will not line up.
 */
public class BookForm {

    public void showHeader() {
        System.out.printf("%-10s%-25s%-12s%-15s%n", "Code", "Title", "Price", "Genre");
    }

    // print one book with its header
    public void showOne(Book book) {
        if (book == null) {
            System.out.println("There is nothing to show yet.");
            return;
        }
        showHeader();
        book.display();
    }

    // print a whole array of books under one header
    public void showAll(Book[] books) {
        if (books == null || books.length == 0) {
            System.out.println("No books found.");
            return;
        }

        showHeader();
        for (int i = 0; i < books.length; i++) {
            books[i].display();   // the OVERRIDDEN version runs, because these are Books
        }
    }
}
