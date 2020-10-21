package Decorator1;

/**
 * @Author： bd
 * @Description:   装饰类基类
 * @Date: Created in 10:00 2020/10/21
 */
public abstract class Decorator implements Human {

    public Human human;

    public Decorator(Human human) {
        this.human = human;
    }

}
