package PracticaTercerParcial.Extra;

public class Pc implements IDispositivo{
    private int size;

    public Pc(int size) {
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
