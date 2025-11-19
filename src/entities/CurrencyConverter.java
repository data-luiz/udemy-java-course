package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public double dollars;
    public double quantityDollars;


    public static double calculateDollars(double dollars, double quantity) {
        double total = quantity * dollars;
        return total + total * IOF;
    }

}
