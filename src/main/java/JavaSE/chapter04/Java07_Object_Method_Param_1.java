package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java07_Object_Method_Param_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 18:36
 */
public class Java07_Object_Method_Param_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - 方法 - 参数
        // Java 中参数传递使用值传递
        // 基本数据类型：数值
        // 引用数据类型：引用地址
        int i = 10;
        test(i);
        System.out.println(i); //10
        String s = "abc";
        test1(s);
        System.out.println(s); //abc

        User user = new User();
        user.name = "zhangsan";
        test2(user);
        System.out.println(user.name);
    }
    public static void test(int i){
        i += 10;
    }
    public static void test1(String s){
        s += 10;
    }

    public static void test2(User user){
        user.name = "lisi";
    }
}
class User{
    String name;
}
