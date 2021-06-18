package Adapter.Electronicos;

public class Celular implements IEmpresaA{

    private int serie;
    private String marca;
    private String calidad;

    public Celular(int serie, String marca, String calidad){
        this.serie= serie;
        this.marca = marca;
        this.calidad = calidad;
    }

    public int getSerie() {
        return serie;
    }



    public String getMarca() {
        return marca;
    }

    public String getCalidad() {
        return calidad;
    }

    @Override
    public void obtenerPrecio() {

    }

    @Override
    public void obtenerTiempoDeVida() {

    }
}
