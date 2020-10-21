/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:00 2020/10/21
 */
public class ConcreteFlyweight extends Flyweight {
    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Concrete---Flyweight"+name);
    }
}
