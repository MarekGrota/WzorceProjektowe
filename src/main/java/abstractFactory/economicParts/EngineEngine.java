package abstractFactory.economicParts;

import abstractFactory.Engine;

public class EngineEngine implements Engine {
    @Override
    public void create() {

        System.out.println("Utworzono silnik spalinowy");
    }
}
