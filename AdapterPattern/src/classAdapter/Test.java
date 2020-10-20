package classAdapter;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 18:34 2020/10/20
 */
public class Test {

    public static void main(String[] args) {
        //使用标准的接口 调用

        //1.使用普通的功能
        Target commonTarget = new CommonTarget();
        commonTarget.request();

        //2.使用适配器的功能
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
