package AbstractFactory;

import AbstractFactory.factory.FactoryBMW320;
import AbstractFactory.factory.FactoryBMW523;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 16:38 2020/10/20
 */
public class Customer {

    public static void main(String[] args){
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();
    }
}
