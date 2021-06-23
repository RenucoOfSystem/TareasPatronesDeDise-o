package Proxy.TarjetaDebito;

public class Client {
    public static void main(String[]args){
        TarjetaDebito tarjetaDebito = new TarjetaDebito(111, "Renuco", 100, "bs");
        tarjetaDebito.descontarDinero("bs", 10);
        tarjetaDebito.descontarDinero("usd", 20);
        tarjetaDebito.descontarDinero("usd", 10);
        tarjetaDebito.descontarDinero("euro", 1);
        tarjetaDebito.descontarDinero("aaaa", 10);
        tarjetaDebito.descontarDinero("bs",20);

    }
}
