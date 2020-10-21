package Decorator1;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:08 2020/10/21
 */
public class Decorator_zero extends Decorator {
    public Decorator_zero(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
        System.out.println("进房子。。。");
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
        System.out.println("书房找地图。。。");
    }
}
