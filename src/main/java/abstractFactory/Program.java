package abstractFactory;

import abstractFactory.economicParts.EconomicalCarPartsFactory;
import abstractFactory.luxuryParts.LuxuryCarPartsFactory;


public class Program {

    public static void main(String[] args) {

        AutoPartsFactory autoPartsFactory = new EconomicalCarPartsFactory();

        Engine engine = autoPartsFactory.createEngine();
        engine.create();

        Lights lights = autoPartsFactory.createLights();
        lights.create();

        Tires tires = autoPartsFactory.createTires();
        tires.create();

        System.out.println();

        autoPartsFactory = new LuxuryCarPartsFactory();

        engine = autoPartsFactory.createEngine();
        engine.create();

        lights = autoPartsFactory.createLights();
        lights.create();

        tires = autoPartsFactory.createTires();
        tires.create();
    }
}
