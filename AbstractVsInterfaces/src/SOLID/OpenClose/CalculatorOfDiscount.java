package SOLID.OpenClose;

/**
 * This class use the inteface whitout know details
 * if we want add Discount's Types this class wont be modified
 * you'll need to add extension(new implementation of Discount Interface) and no modified
 */
public class CalculatorOfDiscount {
    public double applyDiscount(Discount discount, double monto){
        return discount.estimate(monto);
    }
}
