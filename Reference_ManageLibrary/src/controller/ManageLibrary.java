package controller;

import model.Book;
import model.BookList;
import view.BookForm;
import view.DataInput;
import view.Menu;

/*
 * THE CONTROLLER — the traffic director.
 *
 * It owns one of everything, runs the loop, and for each menu choice it:
 *   1. asks the VIEW to collect input
 *   2. asks the MODEL to do the work
 *   3. asks the VIEW to print the result
 *
 * Notice there is not one System.out.printf in this whole file, and not one
 * line of sorting or searching logic. Printing belongs to view, logic belongs
 * to model. If you find yourself formatting a table here, it belongs in
 * BookForm instead.
 */
public class ManageLibrary {

    private BookList bookList = new BookList();
    private Menu menu = new Menu();
    private DataInput input = new DataInput();
    private BookForm form = new BookForm();

    public void run() {
        boolean running = true;

        while (running) {
            int choice = menu.showAndGetChoice();

            switch (choice) {
                case 1:
                    inputBooks();
                    break;
                case 2:
                    showRecent();
                    break;
                case 3:
                    searchBooks();
                    break;
                case 4:
                    showSorted();
                    break;
                case 5:
                    System.out.println("Goodbye.");
                    running = false;   // ends the while loop on the next check
                    break;
            }
        }
    }

    // ---- Option 1 ----
    private void inputBooks() {
        boolean more = true;

        while (more) {
            // every field goes through DataInput, so invalid values never reach the model
            String code  = input.getString("Enter code of book: ");
            String title = input.getString("Enter title of book: ");
            float price  = input.getPositiveFloat("Enter price: ");
            String genre = input.getString("Enter genre of book: ");

            // build the object, then hand it to the model
            Book book = new Book(code, title, price, genre);
            bookList.addBook(book);

            more = input.getYesNo("Do you want to continue? (y/n): ");
        }
    }

    // ---- Option 2 ----
    private void showRecent() {
        Book recent = bookList.getRecentlyAddedBook();
        form.showOne(recent);   // showOne already handles the null case
    }

    // ---- Option 3 ----
    private void searchBooks() {
        if (bookList.isEmpty()) {
            System.out.println("There are no books to search yet.");
            return;
        }

        String title = input.getString("Enter the title you want to search for: ");
        Book[] results = bookList.searchByTitle(title);
        form.showAll(results);
    }

    // ---- Option 4 ----
    private void showSorted() {
        /*
         * sortByTitleAscending() is declared "throws Exception", so the compiler
         * forces you to deal with that possibility. try/catch is how you do it:
         * try the risky call, and if it throws, the catch block runs instead of
         * the program crashing.
         */
        try {
            Book[] sorted = bookList.sortByTitleAscending();
            form.showAll(sorted);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
