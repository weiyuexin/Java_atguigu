package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java19_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 21:26
 */
public class Java19_Object {
    public static void main(String[] args) {
        // TODO 面向对象 - 单例模式
        // JVM默认给类提供的构造方法，其实就是公共的、无参的构造方法
        // 一般使用private的场景：
        // 1、类的创建过程复杂
        // 2、类的对象消耗资源
        //User19 user19 = new User19();
        User19 instance = User19.getInstance();
        User19 instance2 = User19.getInstance();
        User19 instance3 = User19.getInstance();
        User19 instance4 = User19.getInstance();
        User19 instance5 = User19.getInstance();

        System.out.println(instance.equals(instance5));
    }
}
class User19{
    private static User19 user19 = null;
    private User19(){

    }
//    protected User19(){
//
//    }
//    public User19(){
//
//    }

    // 实现每次new时创建的对象都是同一个，解决对象消耗资源的问题
    public static User19 getInstance(){
        if (user19 == null){
            user19 = new User19();
        }
        return user19;
    }
}
