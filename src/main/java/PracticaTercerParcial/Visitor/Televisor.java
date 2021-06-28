package PracticaTercerParcial.Visitor;

public class Televisor implements IArtefactoElectronico{

    private String marca;
    private String size;
    private int precio;
    private boolean smart;

    public Televisor(String marca, String size, int precio, boolean smart) {
        this.marca = marca;
        this.size = size;
        this.precio = precio;
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public String getSize() {
        return size;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isSmart() {
        return smart;
    }

    @Override
    public void accept(IApp app) {
        app.recomendarMatenimiento(this);
    }

    public void showInfo(){
        System.out.println("***Mostrando caracteristicas del Televisor***");
        System.out.println("Marca: " + getMarca());
        System.out.println("Tamano: " +getSize() );
        System.out.println("Precio: " + getPrecio());
        if(isSmart())
            System.out.println("El televisor es smart");
        else {
            System.out.println("El televisor NO es smart");
        }
    }
}
