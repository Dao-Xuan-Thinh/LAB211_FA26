package controller;

/*
 * ENTRY POINT.
 *
 * Deliberately tiny. Its only job is to create the controller and start it.
 * All the actual work lives in ManageLibrary.
 *
 * Why does main have to be static?
 *   static = belongs to the class, not to an object.
 *   Java has to call main BEFORE any object exists, so main cannot require one.
 *   That is also why you must create an object (`new ManageLibrary()`) before
 *   you can call run(), which is not static — exactly the same reason you wrote
 *   `Bubble_sort_algorithm b = new Bubble_sort_algorithm();` in Week 1.
 */
public class Main {

    public static void main(String[] args) {
        ManageLibrary program = new ManageLibrary();
        program.run();
    }
}
