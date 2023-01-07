package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java11_Object_Instance
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 20:41
 */
public class Java11_Object_Instance {
    public static void main(String[] args) {
        // TODO 面向对象 - 构建对象
        // 构造方法：专门用于构造对象
        // 如果一个类中没有任何构造方法，那么JVM会自动添加一个公共的，无参的构造方法，方便对象调用
        // TODO 基本语法：类名(){}
        //      1、构造方法也是方法，但是没有void关键字
        //      2、方法名和类名完全相同
        //      3、如果类中没有构造方法，那么JVM会提供默认的构造方法
        //      4、如果类有构造方法，那么JVM就不会提供默认的构造方法
        //      5、构造方法也是方法，所以也可以传递参数，但是一般传递参数的目的是用于对象属性的初始化
        System.out.println("before...");
        User11 user = new User11("张三");
        System.out.println("after...");
        user.test();
        System.out.println(user.username);
        //代码块在构造方法之前执行
    }
}
class User11{
    String username;
    // 构造方法
    User11(){
        System.out.println("user...");
    }
    //代码块
    {
        System.out.println("代码块1");
    }

    User11(String name){
        username = name;
        System.out.println("构造方法");
    }
    //代码块
    {
        System.out.println("代码块2");
    }

    void test(){
        System.out.println("test");
    }
    //代码块
    {
        System.out.println("代码块3");
    }
}
