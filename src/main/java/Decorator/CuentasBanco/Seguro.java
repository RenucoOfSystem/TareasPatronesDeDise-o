package Decorator.CuentasBanco;



public class Seguro extends Funcionalidad{

    private int valorSeguro;
    public Seguro(ICuenta cuenta, int valorSeguro) {
        super(cuenta);
        this.valorSeguro = valorSeguro;
    }

    public int getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(int valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Agregando seguro");
        System.out.println("Monto inicial: " + super.getMonto());
        super.setMonto(getMonto()-valorSeguro);
        System.out.println("Monto con seguro pagado: " + super.getMonto());


    }
}
