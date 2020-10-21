package Decorator1;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:11 2020/10/21
 */
public class Decorator_first extends Decorator {
    public Decorator_first(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
        System.out.println("在衣柜找找。。。");
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
        System.out.println("在地图上找找。。。");
    }
}
