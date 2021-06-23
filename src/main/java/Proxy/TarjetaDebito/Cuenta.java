package Proxy.TarjetaDebito;

public class Cuenta implements ICuenta{
    private String nombreTitular;
    private int monto;
    private String tipoDeMonedaAceptada;


    public Cuenta(String nombreTitular, int monto, String tipoDeMonedaAceptada) {
        this.nombreTitular = nombreTitular;
        this.monto = monto;
        this.tipoDeMonedaAceptada = tipoDeMonedaAceptada;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTipoDeMonedaAceptada() {
        return tipoDeMonedaAceptada;
    }

    public void setTipoDeMonedaAceptada(String tipoDeMonedaAceptada) {
        this.tipoDeMonedaAceptada = tipoDeMonedaAceptada;
    }

    @Override
    public void descontarDinero(String moneda, int monto) {
        System.out.println("Monto actual: "+getMonto()+" "+getTipoDeMonedaAceptada());
        System.out.println("Descontanto: " + monto+" "+moneda+"...");
        setMonto(getMonto()-monto);
        System.out.println("Monto actual: "+ getMonto()+" "+getTipoDeMonedaAceptada());
    }

    void showInfo(){
        System.out.println("Titular: " + this.nombreTitular);
        System.out.println("Cuenta en: " +this.tipoDeMonedaAceptada);
        System.out.println("Monto en la cuenta: " + this.monto);
    }
}
