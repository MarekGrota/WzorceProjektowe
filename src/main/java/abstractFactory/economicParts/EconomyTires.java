package abstractFactory.economicParts;

import abstractFactory.Tires;

public class EconomyTires implements Tires {


    @Override
    public void create() {
        System.out.println("Utworzono opony ekonomiczne");
    }
}
