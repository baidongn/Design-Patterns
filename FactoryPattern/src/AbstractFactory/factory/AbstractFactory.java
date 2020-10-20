package AbstractFactory.factory;

import AbstractFactory.part.Aircondition;
import AbstractFactory.part.Engine;

/**
 * @Author： bd
 * @Description: 每辆汽车的发动机 和空调不一样，进行配对
 * @Date: Created in 16:17 2020/10/20
 */
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();

    //制造空调
    public Aircondition createAircondition();

}
