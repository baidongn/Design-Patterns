package FactoryMethod;

import FactoryMethod.factory.FactoryBMW320;
import FactoryMethod.factory.FactoryBMW523;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:53 2020/10/20
 */
public class Customer {
    public static void main(String[] args) {

        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }
}
