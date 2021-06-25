package Composite.Computadoras;

public abstract class ArtefactoElectronico {
    private String tipo;
    private int precio;
    private int serie;

    public ArtefactoElectronico(String tipo, int precio, int serie) {
        this.tipo = tipo;
        this.precio = precio;
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        System.out.println("\n Tipo: "+ getTipo());
        System.out.println("serie: "+getSerie());
        System.out.println("precio: "+getPrecio()+"\n");
    }

    public abstract void operation();
    public abstract void add(ArtefactoElectronico artefactoElectronico);
    public abstract void remove(ArtefactoElectronico artefactoElectronico);
    public abstract void getChild(int position);
}
