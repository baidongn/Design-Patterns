package Decorator1;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:14 2020/10/21
 */
public class Test {
    public static void main(String[] args) {
        Human human = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(human)));
        decorator.wearClothes();

        decorator.walkToWhere();

    }
}
