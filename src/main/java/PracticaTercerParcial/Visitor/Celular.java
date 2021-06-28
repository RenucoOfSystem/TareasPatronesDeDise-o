package PracticaTercerParcial.Visitor;

public class Celular implements IArtefactoElectronico{
    private String marca;
    private int serie;
    private int precio;

    public Celular(String marca, int serie, int precio) {
        this.marca = marca;
        this.serie = serie;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getSerie() {
        return serie;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public void accept(IApp app) {
        app.recomendarMatenimiento(this);
    }
    void showInfo(){
        System.out.println("***Mostrando informacion del celular***");
        System.out.println("Marca: " + getMarca());
        System.out.println("Serie: " + getSerie());
        System.out.println("Precio: " + getPrecio());
    }
}
