package FacadeTwo;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:09 2020/10/21
 */
public class ModuleA {

    /*
     *提供给外部使用的方法
     */
    public void a1() { };
    /*
     *提供给子系统之间相互调用的方法
     */
    protected void a2() { };

    private void a3() { };
}
