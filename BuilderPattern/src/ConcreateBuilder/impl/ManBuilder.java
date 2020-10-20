package ConcreateBuilder.impl;

import ConcreateBuilder.PersonBuilder;
import Product.Man;
import Product.Person;

/**
 * @Author： bd
 * @Description: ConcreteBuilder：实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。
 * @Date: Created in 14:27 2020/10/20
 */
public class ManBuilder implements PersonBuilder {
    Person person;
    public ManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildBody() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public void buildFoot() {
        person.setHead("建造男人的头");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
