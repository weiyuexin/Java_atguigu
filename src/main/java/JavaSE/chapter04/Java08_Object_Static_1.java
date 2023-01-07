package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java08_Object_Static_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 19:56
 */
public class Java08_Object_Static_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - 静态
        // 先有类，再有对象
        // 成员方法可以访问静态属性和方法
        // 静态方法不能访问成员f属性和方法
        Test t = new Test();
        t.sex = "女";
        t.test();
//        t.test1();
//        Test.test1();
    }
}
class Test{
    //成员属性
    String name;
    // 静态属性
    static String sex;
    //成员方法
    void test(){
        //test1();
        //System.out.println(sex);
        System.out.println("test...");
    }
    // 静态方法
    static void test1(){
        System.out.println("test1...");
    }
}
class Bird1{
    static String type = "鸟";
    static void fly(){
        System.out.println("飞起来了");
    }
}
