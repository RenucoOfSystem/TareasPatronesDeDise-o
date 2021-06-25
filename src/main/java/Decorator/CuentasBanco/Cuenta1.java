package Decorator.CuentasBanco;

public class Cuenta1 implements ICuenta{

    private String nombrePropetario;
    private int monto;
    private String numeroCuenta;

    public Cuenta1(String nombrePropetario, int monto, String numeroCuenta) {
        this.nombrePropetario = nombrePropetario;
        this.monto = monto;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombrePropetario() {
        return nombrePropetario;
    }
    @Override
    public int getMonto() {
        return monto;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNombrePropetario(String nombrePropetario) {
        this.nombrePropetario = nombrePropetario;
    }
    @Override
    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void operation() {
        System.out.println("NombreCuenta : "+nombrePropetario);
        System.out.println("Monto : "+monto);
        System.out.println("NumeroCuenta : "+numeroCuenta);
    }
}
