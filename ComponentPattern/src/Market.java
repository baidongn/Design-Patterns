/**
 * @Author： bd
 * @Description:
 *  1.我们的部件有，总店，分店，加盟店！
 *
 * 2.我们的部件共有的行为是：刷会员卡
 *
 * 3.部件之间的层次关系，也就是店面的层次关系是，总店下有分店、分店下可以拥有加盟店。
 *
 *有了我们这几个必要条件后，我的要求就是目前店面搞活动当我在总店刷卡后，就可以累积相当于在所有下级店面刷卡的积分总额
 * @Date: Created in 11:40 2020/10/21
 */
public abstract class Market {
    String name;
    public abstract void add(Market m);

    public abstract void remove(Market m);

    public abstract void PayByCard();
}
