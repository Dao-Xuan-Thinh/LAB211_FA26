package controller;

import model.FractionList;
import view.Menu;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        FractionList FL = new FractionList();

        int n = menu.showAndGet();
        FL.genFraction(n);
        FL.sort();
        System.out.println(FL.getList());
        System.out.println(FL.sum());
    }
}