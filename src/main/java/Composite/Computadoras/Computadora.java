package Composite.Computadoras;

public class Computadora extends ArtefactoElectronico{


    public Computadora(String tipo, int precio, int serie) {
        super(tipo, precio, serie);
    }

    @Override
    public void operation() {
        this.showInfo();
    }

    @Override
    public void add(ArtefactoElectronico artefactoElectronico) {
        System.out.println("No applicable");
    }

    @Override
    public void remove(ArtefactoElectronico artefactoElectronico) {
        System.out.println("No applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No applicable");
    }
}
