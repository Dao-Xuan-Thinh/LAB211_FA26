package model;

public class Fraction implements Comparable<Fraction>{
    int numerator, denominator;

    public Fraction(){}

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int gcd(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public void reduce() {
        int g = gcd(numerator, denominator);

        numerator = numerator / g;
        denominator = denominator / g;
    }
    
    public Fraction addFraction(Fraction f) {
        Fraction result = new Fraction(this.numerator*f.denominator + this.denominator*f.numerator, this.denominator*f.denominator);
        result.reduce();
        return result;
    }

    @Override
    public int compareTo(Fraction f){
        return Double.compare((double) this.numerator / this.denominator, (double) f.numerator/ f.denominator);
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
