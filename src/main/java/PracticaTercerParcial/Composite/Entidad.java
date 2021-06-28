package PracticaTercerParcial.Composite;

public abstract class Entidad {
    private String tipo;
    private int numeroPalabras;
    private String contenido;


    public Entidad(String tipo,String contenido, int numeroPalabras){
        this.tipo=tipo;
        this.numeroPalabras=numeroPalabras;
        this.contenido=contenido;

    }

    public void showInfo(){
        System.out.println("\nTipo: "+getTipo());
        System.out.println("Numero de palabras: "+ getNumeroPalabras());
        System.out.println("Contenido: "+getContenido()+"\n");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }



    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public abstract void operation();
    public abstract void add(Entidad component);
    public abstract void remove(Entidad component);
    public abstract void getChild(int position);
}

