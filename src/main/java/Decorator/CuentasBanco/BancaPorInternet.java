package Decorator.CuentasBanco;

public class BancaPorInternet extends Funcionalidad{

    private boolean enable;
    public BancaPorInternet(ICuenta cuenta, boolean enable) {
        super(cuenta);
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Agregando banca por intenet");
        if(this.enable){
            System.out.println("Banca habilitada");
        }
        else {
            System.out.println("Banca NO habilitada");
        }
    }
}
