package Coupling.TravelExample.TightCoupling;

import Coupling.TravelExample.TightCoupling.Bus;

public class Travel {
    public void star(){
        Bus bus = new Bus();
        bus.go();

        //Train train = new Train();
        //train.start();
    }

}
