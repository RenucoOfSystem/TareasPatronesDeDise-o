package Visitor.LibreCambista;

public class Client {
    public static void main(String[]args){
        Bolivia bolivia = new Bolivia(6.96);
        Argentina argentina = new Argentina(95.05);
        Brasil brasil = new Brasil(5.01);
        Italia italia = new Italia(1.19);
        Viajero viajero = new Viajero();

        bolivia.accept(viajero, 100);
        argentina.accept(viajero, 100);
        brasil.accept(viajero, 100);
        italia.accept(viajero, 10);
    }
}
