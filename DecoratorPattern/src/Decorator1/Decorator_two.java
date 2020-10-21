package Decorator1;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:22 2020/10/21
 */
public class Decorator_two extends Decorator {
    public Decorator_two(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
        System.out.println("找到一件D&G。。");
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
        System.out.println("在地图上找到一个神秘花园");
    }
}
