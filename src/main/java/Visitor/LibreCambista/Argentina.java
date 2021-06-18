package Visitor.LibreCambista;

public class Argentina implements IPais{
    private String moneda;
    private double usdValue;

    public Argentina(double usdValue) {
        this.moneda = "peso argentino";
        this.usdValue = usdValue;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getUsdValue() {
        return usdValue;
    }

    @Override
    public void accept(IViajero viajero, double amountToChange) {
        viajero.exchange(this, amountToChange);
    }
}
