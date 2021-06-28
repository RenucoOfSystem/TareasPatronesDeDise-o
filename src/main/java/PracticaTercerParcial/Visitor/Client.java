package PracticaTercerParcial.Visitor;

public class Client {
    public static void main(String[]args) {

        Computadora computadora = new Computadora();
        Celular celular = new Celular("Huawei", 111, 1000);
        Televisor televisor = new Televisor("Samsung", "32pulgadas", 2000, false);

        App app = new App();
        celular.accept(app);
        computadora.accept(app);
        televisor.accept(app);



    }
}
