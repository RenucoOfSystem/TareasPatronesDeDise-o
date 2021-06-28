package PracticaTercerParcial.Extra;

public class Client {
    public static void main(String[]args){
        Laptop laptop = new Laptop(3);
        Pc pc = new Pc(7);
        Tablet tablet = new Tablet(15);

        Tecnico tecnico = new Tecnico();

        laptop.accept(tecnico);
        pc.accept(tecnico);
        tablet.accept(tecnico);
    }
}
