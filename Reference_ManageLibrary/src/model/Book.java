package model;

/*
 * CHILD CLASS.
 *
 * "extends Publication" means: Book automatically has code, title and price,
 * plus every getter and setter, without writing any of them again.
 * Book then adds ONE extra field of its own.
 */
public class Book extends Publication {

    // private, because nothing extends Book, so nobody below needs direct access
    private String genre;

    public Book() {
        // Java secretly calls super() here — the parent's no-parameter constructor
    }

    /*
     * The parent's fields are the parent's job to set.
     * super(...) calls Publication's parameter constructor to do exactly that.
     *
     * RULE: super(...) must be the FIRST line of the constructor. Always.
     * Put anything above it and the file will not compile.
     */
    public Book(String code, String title, float price, String genre) {
        super(code, title, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    /*
     * OVERRIDE: same method name and parameters as the parent's, but new behaviour.
     *
     * @Override is not required, but it tells the compiler "I mean to replace
     * the parent's method". If you typo the name, you get an error instead of
     * silently creating a brand new unrelated method. Always write it.
     *
     * Java picks which display() runs based on what the object ACTUALLY is at
     * runtime, not what the variable is declared as. That is polymorphism.
     */
    @Override
    public void display() {
        System.out.printf("%-10s%-25s%-12.1f%-15s%n", code, title, price, genre);
    }
}
