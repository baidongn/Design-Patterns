package ConcreateBuilder.impl;

import ConcreateBuilder.PersonBuilder;
import Product.Person;
import Product.WoMan;

/**
 * @Author： bd
 * @Description: ConcreteBuilder：实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。
 * @Date: Created in 14:27 2020/10/20
 */
public class WoManBuilder implements PersonBuilder {
    Person person;
    public WoManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setBody("建造女孩的身体");
    }

    @Override
    public void buildBody() {
        person.setFoot("建造女孩的脚");
    }

    @Override
    public void buildFoot() {
        person.setHead("建造女孩的头");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
