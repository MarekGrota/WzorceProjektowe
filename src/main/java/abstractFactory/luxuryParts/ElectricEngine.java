package abstractFactory.luxuryParts;

import abstractFactory.Engine;

public class ElectricEngine implements Engine {

    @Override
    public void create() {
        System.out.println("Utworzono silnik elektryczny");
    }
}
