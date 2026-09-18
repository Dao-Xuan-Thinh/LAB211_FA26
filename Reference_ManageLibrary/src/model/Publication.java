package model;

/*
 * BASE CLASS (the parent).
 *
 * This holds the fields that EVERY publication has, no matter what kind.
 * A more specific class (Book) will inherit all of this and add its own extras.
 *
 * Why "protected" and not "private"?
 *   private   = only this class can touch it
 *   protected = this class AND any class that extends it can touch it
 * Since Book extends Publication, Book needs protected to reach these directly.
 */
public class Publication {

    protected String code;
    protected String title;
    protected float price;

    /*
     * CONSTRUCTOR 1: no parameters ("default constructor").
     * Lets you write:  Publication p = new Publication();
     * and fill the fields in later with the setters.
     */
    public Publication() {
    }

    /*
     * CONSTRUCTOR 2: with parameters.
     * Lets you build a fully-filled object in one line.
     *
     * "this.code" means the FIELD of this object.
     * "code" alone means the PARAMETER that was passed in.
     * Without "this." Java would just assign the parameter to itself and do nothing.
     */
    public Publication(String code, String title, float price) {
        this.code = code;
        this.title = title;
        this.price = price;
    }

    // ---- GETTERS: hand the value out ----
    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    // ---- SETTERS: change the value ----
    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /*
     * Print one row of information.
     * Book will OVERRIDE this to also print its own extra field.
     *
     * printf format explained:
     *   %-15s  = a String, left-aligned, padded to 15 characters wide
     *   %-12.1f = a float, left-aligned, 12 wide, 1 digit after the decimal point
     *   %n      = newline
     * The padding is what makes the columns line up.
     */
    public void display() {
        System.out.printf("%-10s%-25s%-12.1f%n", code, title, price);
    }
}
