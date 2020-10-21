/**
 * @Author： bd
 * @Description:  实现类
 * @Date: Created in 14:43 2020/10/21
 */
public class GivenGreenLight implements Strategy  {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
