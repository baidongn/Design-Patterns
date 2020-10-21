/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:13 2020/10/21
 */
public class Test {
    public static void main(String[] args) {
        //创建工厂
        FlyweightFactory factory = new FlyweightFactory();
        //从工厂中直接拿数据（没有的会自动添加进去，然后返回出来，和redis一样），相当于赋值
        Flyweight f1 = factory.getFlyweight("google");
        Flyweight f2 = factory.getFlyweight("Qutr");
        Flyweight f3 = factory.getFlyweight("google");
        Flyweight f4 = factory.getFlyweight("google");
        Flyweight f5 = factory.getFlyweight("google");

        //查看取出的数据
        f1.operation();
        f2.operation();
        f3.operation();
        f4.operation();
        f5.operation();

        //查看工厂中有几个  google 会共享一个对象
        int flyweightSize = factory.getFlyweightSize();
        System.out.println("工厂中有几个  "+flyweightSize);


    }
}
