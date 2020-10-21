/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:11 2020/10/21
 */
public class MarketJoin extends Market {

    public MarketJoin(String name ) {
        this.name = name;
    }

    @Override

    public void add(Market m) {

    }

    @Override
    public void remove(Market m) {

    }

    @Override
    public void PayByCard() {
        System.out.println(name + "消费，积分已经计入该会员卡");

    }
}
