package FactoryMethod.factory;

import FactoryMethod.BMW;
import FactoryMethod.BMW320;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:52 2020/10/20
 */
public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
