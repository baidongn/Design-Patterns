import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author： bd
 * @Description: 在1处定义了一个Hashtable用来存储各个对象；
 * 在2处选出要实例化的对象，在6处将该对象返回，如果在Hashtable中没有要选择的对象，此时变量flyweight为null，
 * 产生一个新的flyweight存储在Hashtable中，并将该对象返回。
 * @Date: Created in 14:01 2020/10/21
 */
public class FlyweightFactory {
    //为什么用hash，因为可以去重,必须用 key-value形式，形式可以更加灵活
    private Hashtable flyweights = new Hashtable();

    public Flyweight getFlyweight(Object o) {
        Flyweight flyweight = (Flyweight) flyweights.get(o);
        if (null==flyweight) {
        //产生新的ConcreteFlyweigh
            flyweight =    new ConcreteFlyweight((String) o);
            flyweights.put(o, flyweight);
        }
        return flyweight;
    }
    public int getFlyweightSize() {
        return flyweights.size();
    }


}
