/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:14 2020/10/21
 */
public class Test {

    public static void main(String[] args) {

        MarketBranch rootBranch= new MarketBranch("总店");
        MarketBranch qhdBranch = new MarketBranch("秦黄岛分店");

        MarketJoin hgqJoin  = new MarketJoin("秦皇岛分店加盟店一");
        MarketJoin btlJoin   = new MarketJoin("秦皇岛分店加盟店二");

        qhdBranch.add(hgqJoin);
        qhdBranch.add(btlJoin);

        rootBranch.add(qhdBranch);
        rootBranch.PayByCard();
    }
}
