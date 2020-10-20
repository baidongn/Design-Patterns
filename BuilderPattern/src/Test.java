import ConcreateBuilder.impl.ManBuilder;
import ConcreateBuilder.impl.WoManBuilder;
import Product.Person;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:40 2020/10/20
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        Person person1 = personDirector.constructPerson(new WoManBuilder());
        System.out.println(person1.getHead());
        System.out.println(person1.getBody());
        System.out.println(person1.getFoot());
    }
}
