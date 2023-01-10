package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java17_Object_Access
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 20:39
 */
public class Java17_Object_Access {
    private String name; //只能在同一个类中访问
    public String username;
    String sex; //default 权限：同一包下任意访问
    public static void main(String[] args) {
        // TODO 面向对象 - 访问权限
        // public: 公共的，访问权限修饰符
        //      Java源码中，公共类只能有一个，而且必须和源码文件相同
        // main方法：main方法是由JVM调用的，JVM调用时应该可以任意调用，而不用考虑权限问题

        // TODO Java中访问权限主要分为四种：
        //   1、private ：私有的,同一个类中可以使用
        //   2、(default): 默认权限，当不设定任何权限时，JVM会默认提供权限，包权限(路径权限)：在一个包中可以任意访问
        //   3、protected：受保护的权限，子类（是不是在同一个包都可以）可以访问
        //   4、public：公共的，任意使用

        User17 user17 = new User17();
//        System.out.println(user17.name); //不能访问
        System.out.println(user17.username);
        System.out.println(user17.sex);
        System.out.println(user17.age);

        Child17 child17 = new Child17();
        System.out.println(child17.age); //protected在子类中可以访问
    }
    static void test(){

    }
}
//public class Test17{ //语法错误
//    String name;
//}
class User17{
    private String name; //只能在同一个类中访问
    public String username;
    String sex; //default 权限：同一包下任意访问
    protected int age;
    void test(){
        System.out.println(name);
        System.out.println(username);
        System.out.println(age);
    }
}
class Child17 extends User17{
    @Override
    void test() {
        System.out.println(age);
    }
}
