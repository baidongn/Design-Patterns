package ConcreateBuilder;

import Product.Person;

/**
 * @Author： bd
 * @Description:  建造者各部分构件的抽象   ：为创建一个产品对象的各个部件指定抽象接口。
 * @Date: Created in 14:19 2020/10/20
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
