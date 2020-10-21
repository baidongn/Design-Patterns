/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:57 2020/10/21
 */
public abstract class AbstractPerson {

    //定义整个骨架流程
    public void prepareGotoSchool() {
        dressUp();
        eatBreakfast();
        takeThings();
    }

    //步骤 延迟到具体实现类 实现
    protected abstract void dressUp();

    protected abstract void eatBreakfast();

    protected abstract void takeThings();
}
