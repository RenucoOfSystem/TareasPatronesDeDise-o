package Composite.Computadoras;

public abstract class ArtefactoElectronico {
    private String Marca;
    private int precio;
    private int serie;

    public ArtefactoElectronico(String marca, int precio, int serie) {
        Marca = marca;
        this.precio = precio;
        this.serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public void showInfo(){
        System.out.println("\n marca: "+getMarca());
        System.out.println("serie: "+getSerie());
        System.out.println("precio: "+getPrecio()+"\n");
    }

    public abstract void operation();
    public abstract void add(ArtefactoElectronico artefactoElectronico);
    public abstract void remove(ArtefactoElectronico artefactoElectronico);
    public abstract void getChild(int position);
}
