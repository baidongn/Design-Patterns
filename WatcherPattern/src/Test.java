/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:20 2020/10/21
 */
public class Test {
    public static void main(String[] args) {

        Transporter transporter = new Transporter();

        Police police = new Police();
        Thief thief = new Thief();
        Security security = new Security();

        //添加观察者
        transporter.addWatcher(police);
        transporter.addWatcher(thief);
        transporter.addWatcher(security);

        transporter.notifyWatcher("扎胎");

    }
}
