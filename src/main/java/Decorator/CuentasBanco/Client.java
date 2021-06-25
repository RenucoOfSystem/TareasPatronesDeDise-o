package Decorator.CuentasBanco;

public class Client {
    public static void main(String[]args){
        ICuenta cuenta1 = new Cuenta1("Renuco", 100, "1111");
        cuenta1 = new BancaPorInternet(cuenta1, true);

        cuenta1 = new Sorteo(cuenta1);

        cuenta1.operation();
    }
}
