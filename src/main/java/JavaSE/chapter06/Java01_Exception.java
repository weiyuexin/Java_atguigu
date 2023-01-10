package JavaSE.chapter06;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: JavaSE.chapter06
 * @ProjectName: Java_atguigu
 * @ClassName: Java01_Exception
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 23:29
 */
public class Java01_Exception {
    public static void main(String[] args) {
        // TODO 错误

        // 1、类型转换出现错误:  语法上的错误
        String s = "123";
//        Integer i = (Integer) s;
        Integer i = Integer.parseInt(s);
        // 2、递归么有跳出的逻辑：StackOverflowError  :  Error 错误
        // 尽量避免
//        test();
        // 3、访问一个为空的对象的成员方法时，出现了错误：java.lang.NullPointerException  :   Exception 异常
        //      Java中异常分为两大类：
        //      3.1、可以通过代码恢复正常逻辑执行的异常：称之为运行期异常：RuntimeException
        //      3.2、不可以通过代码恢复正常逻辑执行的异常：称之为编译期异常（可能会出现，不一定出现）：Exception
        User user = null;
        System.out.println(user.toString());
    }
    public static void test(){
        test();
    }
}
class User{


}
