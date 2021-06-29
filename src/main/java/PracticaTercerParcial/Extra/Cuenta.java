package PracticaTercerParcial.Extra;

public class Cuenta {
    private int pago;
    private static Cuenta instance = null;


    private Cuenta(){}
    public static synchronized void makeInstance(){
        if (instance == null)
            instance= new Cuenta();
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public static Cuenta getInstance(){
        if (instance == null)
            makeInstance();
        return instance;
    }
    public synchronized void pagar(int amount, Tecnico tecnico){
        setPago(tecnico.getPrecio());
    }
}
