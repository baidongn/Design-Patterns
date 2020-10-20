package objectAdapter;

import classAdapter.Target;

/**
 * @Author： bd
 * @Description:   对象的 适配器
 * @Date: Created in 18:30 2020/10/20
 */
public class Adapter implements Target {

    // 直接关联被适配类
    private Adaptee adaptee;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
