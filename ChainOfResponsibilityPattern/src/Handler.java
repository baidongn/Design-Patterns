/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:54 2020/10/21
 */
public abstract class Handler {
    protected Handler nextHandler;

    //获取下一个


    public Handler getNextHandler() {
        return nextHandler;
    }

    //设置下一个处理对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //主要处理逻辑
    public abstract String handleFeeRequest(String user , double fee);
}
