package SOLID.OpenClose;

public class RegularDiscount implements Discount{
    @Override
    public double estimate(double monto) {
        return monto * 0.9; // 10% discount
    }
}
