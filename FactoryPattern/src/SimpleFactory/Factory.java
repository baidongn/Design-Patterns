package SimpleFactory;

import com.sun.istack.internal.NotNull;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:34 2020/10/20
 */
public class Factory {
    public BMW getcreateBMW(int type) {
        switch (type) {
            case 320:
                return new BMW320();

            case 523:
                return new BMW523();

            default:
                break;
        }
        return null;
    }
}
