package SimpleFactory;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:28 2020/10/20
 */
public class Customer {
    public static void main(String[] args) {

        Factory factory = new Factory();
        factory.getcreateBMW(320);
        factory.getcreateBMW(523);
    }
}
