package Visitor.LibreCambista;

public class Brasil implements IPais{
    private String moneda;
    private double usdValue;

    public Brasil(double usdValue) {
        this.moneda = "real";
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
        viajero.exchange(this,  amountToChange);
    }
}
