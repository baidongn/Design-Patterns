import java.util.Hashtable;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 16:05 2020/10/21
 */
public class ProjectManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {

        String str = "";

        if (fee < 500) {
            if ("张三".equals(user)) {
                str = "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            } else {
                //其他人一律不同意
                str = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }
        } else {
            //超过500，传给级别高的人处理
            if (getNextHandler() != null) {
                return nextHandler.handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}
