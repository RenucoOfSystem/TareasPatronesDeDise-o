package PracticaTercerParcial.Decorator;

public class Habilidad implements IPersonaje{

    private IPersonaje personaje;

    public Habilidad(IPersonaje personaje) {
        this.personaje = personaje;
    }

    public IPersonaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(IPersonaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void habilidades() {
        this.personaje.habilidades();
    }
}
