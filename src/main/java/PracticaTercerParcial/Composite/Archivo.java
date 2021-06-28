package PracticaTercerParcial.Composite;

public class Archivo extends Entidad{
    public Archivo(String tipo, String contenido, int numeroPalabras) {
        super(tipo, contenido, numeroPalabras);
    }



    @Override
    public void operation() {
        this.showInfo();
    }

    @Override
    public void add(Entidad component) {
        System.out.println("No aplica");
    }

    @Override
    public void remove(Entidad component) {
        System.out.println("No aplica");


    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplica");


    }
}
