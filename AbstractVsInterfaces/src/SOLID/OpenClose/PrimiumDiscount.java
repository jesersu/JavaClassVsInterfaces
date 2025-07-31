package SOLID.OpenClose;

public class PrimiumDiscount implements Discount{
    @Override
    public double estimate(double monto) {
        return monto * 0.80; //20% discount
    }
}
