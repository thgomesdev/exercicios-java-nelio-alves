package entities;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double finalPrice(double price, int quantity){
        double total = price * quantity;
        total += IOF * total;
        return total;
    }
}
