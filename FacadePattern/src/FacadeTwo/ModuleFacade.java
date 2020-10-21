package FacadeTwo;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:13 2020/10/21
 */
public class ModuleFacade {
    ModuleA a = new ModuleA();
    ModuleB b = new ModuleB();
    ModuleC c = new ModuleC();

    /*
     *对外部提供的方法(我可以提供 一个流程给外面，比如FacadeOne中， 也可以对外暴露几个接口，他们想调用哪个就调用哪个)
     */
    public void a1() {
        a.a1();
    }

    public void b1() {
        b.b1();
    }

    public void c1() {
        c.c1();
    }


    /*
    这样定义一个ModuleFacade类可以有效地屏蔽内部的细节，免得客户端去调用Module类时，发现一些不需要它知道的方法。
    比如a2()和a3()方法就不需要让客户端知道，否则既暴露了内部的细节，又让客户端迷惑。
    对客户端来说，他可能还要去思考a2()、a3()方法用来干什么呢？
    其实a2()和a3()方法是内部模块之间交互的，原本就不是对子系统外部的，所以干脆就不要让客户端知道。
     */

}
