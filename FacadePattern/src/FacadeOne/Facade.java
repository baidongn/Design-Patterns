package FacadeOne;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:02 2020/10/21
 */
public class Facade {
    public void test() {
        ModuleA a = new ModuleA();
        a.testA();

        ModuleB b= new ModuleB();
        b.testB();

        ModuleC c = new ModuleC();
        c.testC();
    }

}
