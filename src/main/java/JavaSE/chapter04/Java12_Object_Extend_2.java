package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java12_Object_Extend_2
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 21:16
 */
public class Java12_Object_Extend_2 {
    public static void main(String[] args) {
        // TODO 面向对象 - 继承 -extend
        // 构造方法
        // 父类对象是在子类对象创建前创建完成的，也就意味着创建子类对象前会调用父类的构造方法，创建好父类对象
        // 默认情况下，子类对象构建时，会默认调用父类的构造方法完成父类的创建，使用的是super的方式，只不过JVM自动完成
        // 如果父类提供了构造方法，那么JVM不会提供默认的构造方法，那么子类应该显式调用super方法构造父类对象
        Child2 c1 = new Child2();
        Child2 c2 = new Child2();
        Child2 c3 = new Child2();
        System.out.println(c3.username);
        c1.test();

        // new : 只会构建一个对象
    }
}
class Parent2{
    String username;
    Parent2(String name){
        username = name;
        System.out.println("parent...");
        System.out.println(username);
    }
    void test(){
        System.out.println("test");
    }
}
class Child2 extends Parent2{
    Child2(){
        // 父类构造方法有参数时，必须调用super
        super("zhangsan");
        System.out.println("child...");
    }
    void test(){
        System.out.println("child   test");
    }
}