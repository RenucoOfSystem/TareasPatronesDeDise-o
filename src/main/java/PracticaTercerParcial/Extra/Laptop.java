package PracticaTercerParcial.Extra;

public class Laptop implements IDispositivo{
    private int size;

    public Laptop(int size) {
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
