package abstractFactory.economicParts;

import abstractFactory.AutoPartsFactory;
import abstractFactory.Tires;
import abstractFactory.Engine;
import abstractFactory.Lights;
import abstractFactory.economicParts.HalogenLights;

public class EconomicalCarPartsFactory implements AutoPartsFactory {
    @Override
    public Engine createEngine() {
        return new EngineEngine();
    }

    @Override
    public Lights createLights() {
        return new HalogenLights();
    }

    @Override
    public Tires createTires() {
        return new EconomyTires();
    }
}
