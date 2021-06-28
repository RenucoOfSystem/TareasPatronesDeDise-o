package PracticaTercerParcial.Bridge;

public class PagoEnEfectivo implements IMetodoDePago{

    private String metodoPago;
    public PagoEnEfectivo(){this.metodoPago = "En efectivo";}

    @Override
    public double descuento() {
        return 0;
    }

    @Override
    public String metodo() {
        return this.metodoPago;
    }
}
