package AbstractFactory.factory;

import AbstractFactory.part.Aircondition;
import AbstractFactory.part.Engine;
import AbstractFactory.part.impl.AirconditionA;
import AbstractFactory.part.impl.AirconditionB;
import AbstractFactory.part.impl.EngineA;
import AbstractFactory.part.impl.EngineB;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 16:24 2020/10/20
 */
public class FactoryBMW523  implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
