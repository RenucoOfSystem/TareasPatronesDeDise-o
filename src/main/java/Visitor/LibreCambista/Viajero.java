package Visitor.LibreCambista;

public class Viajero implements IViajero{
    @Override
    public void exchange(Bolivia bolivia, double amountToChange) {
        System.out.println("Cambiando de bolivianos a dolares");
        double change = amountToChange/bolivia.getUsdValue();
        System.out.println("Cambio> "+amountToChange+" "+bolivia.getMoneda()+" son: "+ change+" dolares");
    }

    @Override
    public void exchange(Argentina argentina, double amountToChange) {
        System.out.println("Cambiando de pesos argentinos a dolares");
        double change = amountToChange/argentina.getUsdValue();
        System.out.println("Cambio> "+amountToChange+" "+argentina.getMoneda()+" son: "+ change+" dolares");
    }

    @Override
    public void exchange(Brasil brasil, double amountToChange) {
        System.out.println("Cambiando de reales a dolares");
        double change = amountToChange/brasil.getUsdValue();
        System.out.println("Cambio> "+amountToChange+" "+brasil.getMoneda()+" son: "+ change+" dolares");
    }

    @Override
    public void exchange(Italia italia, double amountToChange) {
        System.out.println("Cambiando de euross a dolares");
        double change = amountToChange*italia.getUsdValue();
        System.out.println("Cambio> "+amountToChange+" "+italia.getMoneda()+" son: "+ change+" dolares");
    }
}
