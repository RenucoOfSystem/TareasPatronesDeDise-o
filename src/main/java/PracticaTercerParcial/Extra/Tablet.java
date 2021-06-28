package PracticaTercerParcial.Extra;

public class Tablet implements IDispositivo{
    private int size;

    public Tablet(int size) {
        this.size = size;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(IServicioTecnico servicioTecnico) {
        servicioTecnico.kitNecesario(this);
    }
}
