package Composite.Computadoras;

public class Client {
    public static void main(String[]args){
        Composite lab1 = new Composite("Lab1", 0, 0);
        lab1.add(new Computadora("compu1", 100, 111));
        lab1.add(new Computadora("compu2", 100, 222));
        lab1.add(new Computadora("compu3", 100, 333));

        Composite lab2 = new Composite("lab2", 0, 0);
        lab2.add(new Computadora("compu4", 100, 444));
        lab2.add(new Computadora("compu5", 100, 555));
        lab2.add(new Computadora("compu6", 100, 666));

        Composite contenedor = new Composite("contenedor", 0, 0);
        contenedor.add(lab1);
        contenedor.add(lab2);

        contenedor.operation();
        contenedor.showTotalPrecio();

    }
}
