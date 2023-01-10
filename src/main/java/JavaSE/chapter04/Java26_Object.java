package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java26_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 23:17
 */
public class Java26_Object {
    public static void main(String[] args) {
        // TODO 面向对象 - 作用域

        User26 user26 = new User26();
        user26.test();
    }
}
class Person26{
    public static String name = "zhangsan";
}
class User26 extends  Person26{
    //public String name = "lisi";
    public static String name = "lisi";
//    public void test(){
//        String name = "wangwu";
//
//        // 如果属性和（局部）变量的名称相同，访问时如果不加修饰符，那么有限访问变量
//        System.out.println(name);
//        System.out.println(super.name);
//        System.out.println(this.name);
//    }
    public static void test(){
        System.out.println(name);
//        System.out.println(super.name);
        System.out.println(Person26.name);

    }
}
