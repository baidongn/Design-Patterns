package classAdapter;

/**
 * @Author： bd
 * @Description: 类的 适配器
 * @Date: Created in 18:30 2020/10/20
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
