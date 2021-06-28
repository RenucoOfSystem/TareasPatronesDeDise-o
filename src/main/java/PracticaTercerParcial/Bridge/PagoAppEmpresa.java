package PracticaTercerParcial.Bridge;

public class PagoAppEmpresa implements IMetodoDePago{
    private String metodoPago;

    public PagoAppEmpresa(){this.metodoPago = "App de la empresa";}

    @Override
    public double descuento() {
        return 0.10;
    }

    @Override
    public String metodo() {
        return this.metodoPago;
    }
}
