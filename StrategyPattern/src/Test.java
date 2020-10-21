/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:46 2020/10/21
 */
public class Test {

    public static void main(String[] args) {
        Context context;

        System.out.println("刚到吴国用第一个计谋");
        context = new Context(new BackDoor());
        context.opertrate();

        System.out.println("吴国用第二个计谋");
        context = new Context(new GivenGreenLight());
        context.opertrate();

        System.out.println("吴国用第三个计谋");
        context = new Context(new BlackEnemy());
        context.opertrate();

    }
}
