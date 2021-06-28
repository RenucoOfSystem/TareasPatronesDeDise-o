package PracticaTercerParcial.Bridge;

public class PagoTigoMoney implements IMetodoDePago{
    private String metodoPago;

    public PagoTigoMoney(){this.metodoPago = "Tigo Money";}

    @Override
    public double descuento() {
        return 0.02;
    }

    @Override
    public String metodo() {
        return this.metodoPago;
    }
}
