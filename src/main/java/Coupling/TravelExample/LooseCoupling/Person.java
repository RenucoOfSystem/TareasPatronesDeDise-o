package Coupling.TravelExample.LooseCoupling;

public class Person {
    public static void main(String[]args){
        ITransport bus = new Bus();
        ITransport train = new Train();
        ITravel travel = new Travel(bus);
        travel.start();
    }
}
