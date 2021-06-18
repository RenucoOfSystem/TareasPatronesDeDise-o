package Visitor.LibreCambista;

public class Bolivia implements IPais{
    private String moneda;
    private double usdValue;

    public Bolivia(double usdValue) {
        this.moneda = "boliviano";
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
