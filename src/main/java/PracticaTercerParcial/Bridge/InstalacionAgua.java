package PracticaTercerParcial.Bridge;

public class InstalacionAgua implements Instalacion{

    private String tipoInstalacion;
    private int precio;
    private IMetodoDePago metodoDePago;
    private int capacidadTanque;

    public InstalacionAgua(int precio, IMetodoDePago metodoDePago, int capacidadTanque) {
        this.precio = precio;
        this.metodoDePago = metodoDePago;
        this.capacidadTanque = capacidadTanque;
        this.tipoInstalacion = "De agua";
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    @Override
    public void pagar() {
        System.out.println("El precio de la instalacion es de: "+ getPrecio());
        System.out.println("El metodo de pago es por: "+ metodoDePago.metodo());
        double montoTotal= (double)getPrecio()-(getPrecio()*metodoDePago.descuento());
        System.out.println("El monto total a pagar es de: "+ montoTotal );
    }

    @Override
    public void showInfo() {
        System.out.println("Tipo de instalacion: "+ getTipoInstalacion());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("Capacidad de tanque: "+ getCapacidadTanque());



    }
}
