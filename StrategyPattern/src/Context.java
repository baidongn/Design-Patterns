/**
 * @Author： bd
 * @Description:  环境类
 * @Date: Created in 14:44 2020/10/21
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void opertrate() {
        strategy.operate();

    }
}
