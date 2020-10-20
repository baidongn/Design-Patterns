package AbstractFactory.factory;

import AbstractFactory.part.Aircondition;
import AbstractFactory.part.Engine;
import AbstractFactory.part.impl.AirconditionA;
import AbstractFactory.part.impl.EngineA;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 16:19 2020/10/20
 */
public class FactoryBMW320 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
