package classAdapter;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 18:33 2020/10/20
 */
public class CommonTarget implements Target {
    @Override
    public void request() {
        System.out.println("实现简单的功能");
    }
}
