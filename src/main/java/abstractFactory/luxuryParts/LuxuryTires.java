package abstractFactory.luxuryParts;

import abstractFactory.Tires;

public class LuxuryTires implements Tires {

    @Override
    public void create() {
        System.out.println("Utworzono opony luksusowe");
    }
}
