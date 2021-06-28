package PracticaTercerParcial.Decorator;

public class AgregarArma extends Habilidad{
    private String arma;
    public AgregarArma(IPersonaje personaje, String arma) {
        super(personaje);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void habilidades() {
        super.habilidades();
        System.out.println("Agregando arma: " +getArma() );

    }
}
