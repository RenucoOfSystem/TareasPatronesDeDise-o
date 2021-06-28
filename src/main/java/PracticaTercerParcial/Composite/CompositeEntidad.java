package PracticaTercerParcial.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEntidad extends Entidad{

    private List<Entidad> entidadList = new ArrayList<>();
    public CompositeEntidad(String tipo, String contenido, int numeroPalabras) {
        super(tipo, contenido, numeroPalabras);
    }

    @Override
    public void operation() {
        this.showInfo();
        Global.totalNumeroPalabras = Global.totalNumeroPalabras+this.getNumeroPalabras();
        for (Entidad entidad : entidadList) {
            entidad.operation();
            Global.totalNumeroPalabras=Global.totalNumeroPalabras+entidad.getNumeroPalabras();
        }
    }

    public void showNumeroDePalabras(){
        System.out.println("-------------------------");
        System.out.println("| TOTAL: "+Global.totalNumeroPalabras+" |");
        System.out.println("-------------------------");
    }
    @Override
    public void add(Entidad component) {
        entidadList.add(component);
    }

    @Override
    public void remove(Entidad component) {
        entidadList.remove(component);

    }

    @Override
    public void getChild(int position) {

    }
}
