package abstractFactory;

import abstractFactory.Tires;
import abstractFactory.Engine;
import abstractFactory.Lights;

public interface AutoPartsFactory {

    Engine createEngine();

    Lights createLights();

    Tires createTires();
}
