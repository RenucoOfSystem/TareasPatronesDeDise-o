package PracticaTercerParcial.Extra;

public class Tecnico implements IServicioTecnico{
    private int precio;
    public Tecnico(){}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void kitNecesario(Laptop laptop) {
        System.out.println("Realizando la reparacion de LAPTOP");
        cobrar(laptop);
        System.out.println("El costo de reparacion es de: " + getPrecio());
    }

    @Override
    public void kitNecesario(Pc pc) {
        System.out.println("Realizando la reparacion de PC");
        cobrar(pc);
        System.out.println("El costo de reparacion es de: " + getPrecio());

    }

    @Override
    public void kitNecesario(Tablet tablet) {
        System.out.println("Realizando la reparacion de TABLET");
        cobrar(tablet);
        System.out.println("El costo de reparacion es de: " + getPrecio());

    }
    public void cobrar(IDispositivo dispositivo){
        if(dispositivo.getSize()<=5){
            setPrecio(100);
        }
        else if(dispositivo.getSize()>5&&dispositivo.getSize()<=10){
            setPrecio(150);
        }
        else {
            setPrecio(200);
        }
    }
}
