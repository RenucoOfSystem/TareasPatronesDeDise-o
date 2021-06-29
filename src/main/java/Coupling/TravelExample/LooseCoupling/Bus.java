package Coupling.TravelExample.LooseCoupling;

public class Bus implements ITransport{
    @Override
    public void start() {
        System.out.println("Viajando por bus");
    }
}
