package OOP.Static.ExStatic3.Util;

public class CurrencyConverter {
    public static double dollarPrice;
    public static double valueToBebought;
    public static double priceInReal;

    public static double valueToBePaid(){
        priceInReal = valueToBebought * dollarPrice;
        return priceInReal;
    }
    public static double lessICO(){
        double finalValue = priceInReal - (priceInReal * 0.06);
        return finalValue;
    }
}

/**
 * I could also put it all on method "valueToBePaid":
 * public class CurrencyConverter {
 *     public static double dollarPrice;
 *     public static double valueToBebought;
 *
 *     public static double valueToBePaid() {
 *         double priceInReal = valueToBebought * dollarPrice;
 *         double finalValue = priceInReal - (priceInReal * 0.06); // Deducting 6% tax
 *         return finalValue;
 *     }
 * }
 */
