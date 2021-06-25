package Decorator.CuentasBanco;

public class Funcionalidad implements ICuenta{
    private ICuenta cuenta;

    public Funcionalidad(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    public ICuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void operation() {
        this.cuenta.operation();
    }

    @Override
    public int getMonto() {
        return 0;
    }

    @Override
    public void setMonto(int monto) {

    }
}
