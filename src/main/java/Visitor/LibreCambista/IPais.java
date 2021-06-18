package Visitor.LibreCambista;

public interface IPais {
    void accept(IViajero viajero, double amountToChange);
}
