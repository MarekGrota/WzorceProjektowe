package abstractFactory.luxuryParts;

import abstractFactory.Lights;

public class LedLights implements Lights {
    @Override
    public void create() {
        System.out.println("Utworzono światła LED");
    }
}
