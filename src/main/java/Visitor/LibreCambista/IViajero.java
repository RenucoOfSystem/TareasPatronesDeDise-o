package Visitor.LibreCambista;

public interface IViajero {
    void exchange(Bolivia bolivia, double amountToChange);
    void exchange(Argentina argentina, double amountToChange);
    void exchange(Brasil brasil, double amountToChange);
    void exchange(Italia italia, double amountToChange);
}
