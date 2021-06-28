package PracticaTercerParcial.Bridge;

public class InstalacionAlcantarillado implements Instalacion{

    private String tipoInstalacion;
    private int precio;
    private IMetodoDePago metodoDePago;


    public InstalacionAlcantarillado(int precio, IMetodoDePago metodoDePago) {
        this.precio = precio;
        this.metodoDePago = metodoDePago;
        this.tipoInstalacion = "De alcantarillado";
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public int getPrecio() {
        return precio;
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



    }
}
