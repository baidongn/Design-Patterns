/**
 * @Author： bd
 * @Description: 抽象的被观察者（添加。移除、通知观察者）
 * @Date: Created in 15:13 2020/10/21
 */
public interface Watched {
    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatcher(String str);

}
