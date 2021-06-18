package Visitor.LibreCambista;

public class Italia implements IPais{
    private String moneda;
    private double usdValue;

    public Italia(double usdValue) {
        this.moneda = "euro";
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
        viajero.exchange(this,amountToChange);
    }
}
