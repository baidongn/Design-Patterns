import sun.net.idn.Punycode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:44 2020/10/21
 */
public class MarketBranch extends Market {
    List<Market> list = new ArrayList<>();

    public MarketBranch(String s) {
        this.name = s;
    }
    @Override
    public void add(Market m) {
        list.add(m);
    }

    @Override
    public void remove(Market m) {
        list.remove(m);
    }

    @Override
    public void PayByCard() {
        System.out.println(name +"消费，积分已经计入该会员卡");
        for (Market market : list) {
            market.PayByCard();
        }
    }
}
