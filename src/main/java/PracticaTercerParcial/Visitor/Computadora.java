package PracticaTercerParcial.Visitor;

public class Computadora implements IArtefactoElectronico{

    @Override
    public void accept(IApp app) {
     app.recomendarMatenimiento(this);

    }
}
