package abstractFactory.economicParts;

import abstractFactory.Lights;

public class HalogenLights implements Lights {


    @Override
    public void create() {
        System.out.println("Utworzono światła halogenowe.");
    }
}
