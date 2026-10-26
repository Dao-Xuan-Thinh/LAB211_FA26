package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

import model.Fraction;

public class FractionList {
    ArrayList<Fraction> FL = new ArrayList<>();

    public ArrayList<Fraction> getList() {
        return FL;
    }

    public void genFraction(int n) {
        Random rand = new Random();

        for (int i = 0; i < n; i++){
            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;

            Fraction f = new Fraction(a, b);
            f.reduce();
            FL.add(f);
        }
    }

    public void sort() {
        Collections.sort(FL);
    }

    public Fraction sum() {
        Fraction result = new Fraction(0, 1);
        for (Fraction f : FL) {
            result = result.addFraction(f);
        }
        return result;
    }
}
