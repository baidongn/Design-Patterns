import java.util.ArrayList;
import java.util.List;

/**
 * @Author： bd
 * @Description:  具体的被观察者
 * @Date: Created in 15:15 2020/10/21
 */
public class Transporter implements Watched {
    List<Watcher> watcherList = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watcherList.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    @Override
    public void notifyWatcher(String msg) {
        for (Watcher watcher : watcherList) {
            watcher.update();
        }

    }
}
