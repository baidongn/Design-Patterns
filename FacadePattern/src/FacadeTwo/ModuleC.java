package FacadeTwo;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:09 2020/10/21
 */
public class ModuleC {

    /*
     *提供给外部使用的方法
     */
    public void c1() { };
    /*
     *提供给子系统之间相互调用的方法
     */
    protected void c2() { };

    private void c3() { };
}
