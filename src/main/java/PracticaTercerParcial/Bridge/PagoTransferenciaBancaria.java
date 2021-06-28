package PracticaTercerParcial.Bridge;

public class PagoTransferenciaBancaria implements IMetodoDePago{
    private String metodoPago;

    public PagoTransferenciaBancaria(){this.metodoPago = "Transferencia bancaria";}

    @Override
    public double descuento() {
        return 0.05;
    }

    @Override
    public String metodo() {
        return this.metodoPago;
    }
}
