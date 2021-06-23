package Proxy.TarjetaDebito;

public class TarjetaDebito implements ICuenta{

    private int numeroDeTarjeta;
    private Cuenta cuenta;

    public TarjetaDebito(int numeroDeTarjeta, String nombreCuenta, int monto, String moneda ) {
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.cuenta = new Cuenta(nombreCuenta, monto, moneda);
    }

    public boolean verificarMonto(int montoAVerificar){
        return montoAVerificar<= cuenta.getMonto();
    }

    @Override
    public void descontarDinero(String moneda, int monto) {
        if(moneda.equals("bs")){
            if(verificarMonto(monto))
            cuenta.descontarDinero(moneda, monto);
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else if(moneda.equals("usd")){
            if (verificarMonto(monto*7))
            cuenta.descontarDinero("bs", monto*7);
            else {
                System.out.println("Saldo insuficiente");
            }

        }
        else if(moneda.equals("euro")){
            if (verificarMonto(monto+10))
            cuenta.descontarDinero("bs", monto*10);
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Tipo de moneda no reconocida");
        }
    }

    public void showInfo(){
        System.out.println("Numero de tarjeta: "+this.numeroDeTarjeta);
        System.out.println("Saldo: " + cuenta.getMonto());
    }
}
