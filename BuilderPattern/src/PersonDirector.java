import ConcreateBuilder.PersonBuilder;
import Product.Person;

/**
 * @Author： bd
 * @Description:  Director :构造一个使用Builder接口的对象，指导构建过程。
 * @Date: Created in 14:39 2020/10/20
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
