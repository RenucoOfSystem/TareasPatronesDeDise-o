package Decorator.CuentasBanco;



public class Sorteo extends Funcionalidad{

    private int ganador;
    public Sorteo(ICuenta cuenta) {
        super(cuenta);
        this.ganador= (int)Math.random()*10;

    }




    @Override
    public void operation() {
        super.operation();
        System.out.println("Sorteando");
        if (ganador%2==0){
            super.setMonto(super.getMonto()*2);
            System.out.println("Ha ganado");
        }

        else {
            System.out.println("No gano");
        }


    }
}
