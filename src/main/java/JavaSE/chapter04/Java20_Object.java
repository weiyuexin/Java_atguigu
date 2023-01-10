package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java20_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 21:38
 */
public class Java20_Object {
    public static void main(String[] args) {
        // TODO - 面向对象
        // Java 中提供了一种语法，可以在数据初始化后不被修改，使用关键字final
        // final可以修饰变量：变量值一旦初始化后就不能被修改
        // final可以修饰属性：那么JVM不会自动初始化，需要自己进行初始化，属性值不能发生变化

        // 一般将final修饰的变量称之为常量、或者叫不可变变量
        // final可以修饰方法，这个方法不能被子类重写
        // final可以修饰类，这样这个类就没有子类了（不能被继承）
        // final不可以修饰构造方法
        // final可以修饰方法的参数，一旦修饰，参数无法修改

        final String name = "zhangsan";

        //name = "lisi";

        System.out.println(name);

        User20 user20 = new User20("zhangsan");
//        user20.name = "zhangsan";
        System.out.println(user20.name); // null

//        user20.name = "lisi"; //不能修改
    }
}
final class User20{
//    public final String name;
    public final String name;

    public User20(String name){
        this.name = name; //这样初始化后，就无法修改
    }
//    public final void test(){
//
//    }
    public void test(final String name){
//        name = "lisi"; //错误
    }
}
//class Child20 extends User20{
//
//    public Child20(String name) {
//        super(name);
//    }
////    public void test(){ //不可修改
////
////    }
//}
