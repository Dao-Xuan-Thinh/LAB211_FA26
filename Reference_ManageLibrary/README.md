# Reference: ManageLibrary

A complete, working, beginner-level MVC console program. Same shape as the
LAB211 geographic assignment, different subject matter, so you can read it,
understand the pattern, then write your own from scratch.

## Read it in this order

1. `model/Publication.java` — fields, two constructors, getters/setters, `display()`
2. `model/Book.java` — `extends`, `super(...)`, `@Override`
3. `model/BookList.java` — the four operations. This is the real work.
4. `view/DataInput.java` — your Week 1 `Check()` pattern, one method per type
5. `view/BookForm.java` — table printing in one place
6. `view/Menu.java` — draws the menu, returns a choice
7. `controller/ManageLibrary.java` — the loop and the switch
8. `controller/Main.java` — three lines

## How it maps to your assignment

| Here | Yours |
|---|---|
| `Publication` | `Country` |
| `Book extends Publication` | `EastAsiaCountries extends Country` |
| `BookList` | `EastAsiaCountryList` |
| `addBook` | `addCountryInformation` |
| `getRecentlyAddedBook` | `getRecentlyEnteredInformation` |
| `searchByTitle` | `searchInformationByName` |
| `sortByTitleAscending` | `sortInformationByAscendingOrder` |
| `ManageLibrary` | `ManageEastAsiaCountry` |
| genre | terrain |
| price (must be > 0) | totalArea (must be > 0) |

## The rule that keeps MVC honest

- **model** never prints and never reads the keyboard
- **view** never calculates anything
- **controller** never formats a table and never sorts

If you catch yourself writing `System.out.printf` in the controller, that line
belongs in the view. If you catch yourself writing a loop that compares objects
in the view, it belongs in the model.

## Four traps this code deliberately avoids

1. **The Scanner newline bug.** Everything is read with `nextLine()` and parsed
   by hand. `nextFloat()` leaves a newline behind and silently skips your next
   question.
2. **Sorting in place.** `sortByTitleAscending()` sorts a *copy*. Reorder the
   real list and "show the most recently entered" starts returning the wrong item.
3. **Empty-list crashes.** `size() - 1` is `-1` on an empty list. Guard first.
4. **Misaligned columns.** The `printf` widths in `BookForm.showHeader()` match
   the widths in `Book.display()` exactly. Change one, change both.

## Run it

Open the folder in IntelliJ, mark `src` as the Sources Root if it isn't already
(right-click → Mark Directory as → Sources Root), then run `controller.Main`.

## Exercise

Add a fifth menu option: "display all books" (unsorted, in entry order). You'll
need one new method in `BookList`, one new case in the switch, and one extra
line in the menu. Nothing else. If you can do that in ten minutes, you've got
the pattern and you're ready to write the country version yourself.
