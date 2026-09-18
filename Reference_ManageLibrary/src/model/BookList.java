package model;

import java.util.ArrayList;

/*
 * THE DATA STORE.
 *
 * This class holds all the books and provides the four operations on them.
 * It does NOT print anything and does NOT read anything from the keyboard.
 * That separation is the whole point of MVC: the model only knows about data.
 *
 * Why ArrayList instead of a plain array?
 *   A plain array has a fixed size — you must know the count up front.
 *   ArrayList grows on its own when you add to it.
 * The <Book> part says "this list holds Book objects only".
 */
public class BookList {

    private ArrayList<Book> list = new ArrayList<>();

    /*
     * METHOD 1 — add one book.
     * Returns nothing (void). It just stores what it was handed.
     */
    public void addBook(Book book) {
        list.add(book);
    }

    /*
     * METHOD 2 — the most recently added book.
     *
     * The newest item is always at the LAST index, which is size() - 1
     * (indexes run 0 .. size-1).
     *
     * Guard clause first: if the list is empty, size()-1 would be -1 and
     * list.get(-1) would crash. Returning null lets the caller decide what to do.
     */
    public Book getRecentlyAddedBook() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /*
     * METHOD 3 — find every book whose title matches.
     *
     * Returns an ARRAY, not an ArrayList, because that is the signature the
     * assignment demands. So: collect into a temporary ArrayList (easy to grow),
     * then convert at the end.
     *
     * toLowerCase() on both sides makes the search case-insensitive.
     * contains() matches partial text — "har" finds "Harry Potter".
     * Use equalsIgnoreCase() instead if you want exact matches only.
     */
    public Book[] searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Book current = list.get(i);
            if (current.getTitle().toLowerCase().contains(title.toLowerCase())) {
                found.add(current);
            }
        }

        // ArrayList -> array. The empty array argument just tells Java the type.
        return found.toArray(new Book[0]);
    }

    /*
     * METHOD 4 — return the books sorted by title, A to Z.
     *
     * CRITICAL: sort a COPY, never the real list.
     * If you reorder the real list, getRecentlyAddedBook() starts returning
     * whatever sorted to the end instead of what was actually entered last.
     * That is a silent bug that costs marks.
     *
     * The sort itself is the same bubble sort you already wrote in Week 1.
     * The only new part is the comparison:
     *   numbers use   a > b
     *   Strings use   a.compareTo(b)
     *
     * compareTo returns:
     *   negative  -> a comes before b alphabetically
     *   zero      -> identical
     *   positive  -> a comes after b
     * So "> 0" means "these two are in the wrong order, swap them".
     */
    public Book[] sortByTitleAscending() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("The list is empty, nothing to sort.");
        }

        // copy the references into a new array so the original order survives
        Book[] sorted = list.toArray(new Book[0]);

        for (int i = 0; i < sorted.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j].getTitle().compareTo(sorted[j + 1].getTitle()) > 0) {
                    Book temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break; // already in order, stop early
            }
        }

        return sorted;
    }

    // small helper so the controller can check before calling things
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
