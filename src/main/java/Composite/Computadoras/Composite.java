package Composite.Computadoras;

import java.util.ArrayList;
import java.util.List;

public class Composite extends ArtefactoElectronico{

    private List<ArtefactoElectronico> artefactoElectronicoList = new ArrayList<>();

    public Composite(String tipo, int precio, int serie) {
        super(tipo, precio, serie);
    }

    @Override
    public void operation() {
        this.showInfo();
        Precio.precioTotal=Precio.precioTotal+this.getPrecio();
        for (ArtefactoElectronico artefactoElectronico : artefactoElectronicoList) {
            artefactoElectronico.operation();
            Precio.precioTotal=Precio.precioTotal+ artefactoElectronico.getPrecio();
        }
    }

    public void showTotalPrecio(){
        System.out.println("-------------------------");
        System.out.println("| TOTAL: "+Precio.precioTotal+" |");
        System.out.println("-------------------------");
    }

    @Override
    public void add(ArtefactoElectronico artefactoElectronico) {
        artefactoElectronicoList.add(artefactoElectronico);
    }

    @Override
    public void remove(ArtefactoElectronico artefactoElectronico) {
        artefactoElectronicoList.remove(artefactoElectronico);
    }

    @Override
    public void getChild(int position) {

    }
}
