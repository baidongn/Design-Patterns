package Decorator1;

/**
 * @Author： bd
 * @Description:  初始类
 * @Date: Created in 9:58 2020/10/21
 */
public class Person implements Human {

    @Override
    public void wearClothes() {
        System.out.println("穿什么？？？");

    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢 ？？？");
    }
}
