package PracticaTercerParcial.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEntidad extends Entidad{

    private List<Entidad> entidadList = new ArrayList<>();
    public CompositeEntidad(String tipo, String contenido) {
        super(tipo, contenido);
    }

    @Override
    public void operation() {
        this.showInfo();
        for (Entidad entidad : entidadList) {
            entidad.operation();
        }
    }


    @Override
    public void add(Entidad component) {
        entidadList.add(component);
        this.setNumeroPalabras(this.getNumeroPalabras()+ component.getNumeroPalabras());
    }

    @Override
    public void remove(Entidad component) {
        entidadList.remove(component);

    }

    @Override
    public void getChild(int position) {

    }
}
