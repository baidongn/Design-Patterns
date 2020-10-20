package FactoryMethod.factory;

import FactoryMethod.BMW;
import FactoryMethod.BMW523;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:53 2020/10/20
 */
public class FactoryBMW523  implements FactoryBMW  {
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
