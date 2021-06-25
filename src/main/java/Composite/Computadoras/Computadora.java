package Composite.Computadoras;

public class Computadora extends ArtefactoElectronico{


    public Computadora(String marca, int precio, int serie) {
        super(marca, precio, serie);
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
