package controller;

import model.*;
import view.Menu;

public class Main {
    public static void main(String[] args){
        Fraction Frac = new Fraction();

        Menu menu = new Menu();
        FractionList FL = new FractionList();
        Fraction f = new Fraction(5, 0);
        Frac.addFraction(f);

        int n = menu.showAndGet();
        FL.genFraction(n);
        FL.sort();
        System.out.println(FL.getList());
        System.out.println(FL.sum());
    }
}