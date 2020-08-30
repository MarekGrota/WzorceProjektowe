package abstractFactory.luxuryParts;

import abstractFactory.AutoPartsFactory;
import abstractFactory.Tires;
import abstractFactory.Engine;
import abstractFactory.Lights;

public class LuxuryCarPartsFactory implements AutoPartsFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Lights createLights() {
        return new LedLights();
    }

    @Override
    public Tires createTires() {
        return new LuxuryTires();
    }
}
