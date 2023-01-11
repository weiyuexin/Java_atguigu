package JavaSE.chapter06;

/**
 * @PackageName: JavaSE.chapter06
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Exception
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/11 12:58
 */
public class Java03_Exception {
    public static void main(String[] args) {
        // TODO 异常
        // 1、除数为0的算术异常：java.lang.ArithmeticException
        // 运行期异常
        int i = 0;
        if( i != 0){
            int j = 10 / i;
        }
        // 2、空指针异常: java.lang.NullPointerException
        //  调用了一个为空对象(null)的成员属性或成员方法时发生异常
        User3 user3 = null;
//        if(user3 != null){
//            System.out.println(user3.toString());
//        }
        try{
//            System.out.println(user3.toString());
            System.out.println(user3.name);
        }catch (NullPointerException e){
            System.out.println("对象为空");
        }
    }
}
class User3{

    public static String name = "张三";
}
