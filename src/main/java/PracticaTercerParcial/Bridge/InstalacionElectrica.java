package PracticaTercerParcial.Bridge;

public class InstalacionElectrica implements Instalacion{

    private String tipoInstalacion;
    private int precio;
    private IMetodoDePago metodoDePago;
    private int numeroFocos;

    public InstalacionElectrica(int precio, IMetodoDePago metodoDePago, int numeroFocos) {
        this.precio = precio;
        this.metodoDePago = metodoDePago;
        this.numeroFocos = numeroFocos;
        this.tipoInstalacion = "Electrica";
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumeroFocos() {
        return numeroFocos;
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
        System.out.println("Numero de focos: "+ getNumeroFocos());



    }
}
