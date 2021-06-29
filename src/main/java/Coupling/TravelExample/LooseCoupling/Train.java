package Coupling.TravelExample.LooseCoupling;

public class Train implements ITransport{
    @Override
    public void start() {
        System.out.println("Viajando por tren");
    }
}
