package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java08_Object_Static_2
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 20:07
 */
public class Java08_Object_Static_2 {
    public static void main(String[] args) {
        // TODO 面向对象 - 静态 -静态代码块

        // 类的信息加载完成后会自动调用静态代码块,可以完成静态属性的初始化功能
        // 对象准备创建时，也会自动调用代码块，但不是静态的
//        User08.test();
        new User08();
    }
}
class User08{
    static {
        // 静态代码块
        System.out.println("静态代码块执行1");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行2");
    }
    {
        System.out.println("代码块执行1");
    }
    static void test(){
        System.out.println("test...");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行3");
    }
    {
        System.out.println("代码块执行2");
    }
}
