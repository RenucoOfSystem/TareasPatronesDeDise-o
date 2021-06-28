package PracticaTercerParcial.Visitor;

public interface IApp {
    void recomendarMatenimiento(Celular celular);
    void recomendarMatenimiento(Computadora computadora);
    void recomendarMatenimiento(Televisor televisor);
}
