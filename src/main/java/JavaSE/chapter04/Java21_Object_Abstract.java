package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java21_Object_Abstract
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 21:56
 */
public class Java21_Object_Abstract {
    public static void main(String[] args) {
        // TODO 面向对象 - 抽象 - Abstract
        // 抽象类：不完整的类，就是抽象类(类中方法不完整的话，类就是不完整)
        //          abstract class 类名{}
        //          因为类不完整，所以无法直接构造对象
        // 抽象方法：只要声明，没有实现的方法
        //          abstract 返回值类型 方法名(参数) 没有大括号

        // 分析问题：对象（具体） => 类（抽象）
        // 编写代码：类（抽象） => 对象（具体）

        //如果一个类中含有抽象方法，那么这个类是抽象类
        //如果一个类是抽象类，他的方法不一定是抽象方法

        //抽象类无法直接构造对象，但是可以通过子类间接构造对象
        //如果抽象类中含有抽象方法，那么子类继承抽象类，需要重写抽象方法，将发放补充完整

        //abstract关键字不能和final同时使用

//        Person21 person21 = new Person21(); //抽象类无法实例化
        Chinese21 chinese21 = new Chinese21();
        Person21 p = new Chinese21();


    }
}
//class Person21{
//    public abstract void eat();
//}
abstract class Person21{
    public abstract void eat();
    public void test1(){

    }
}
class Chinese21 extends Person21{

    @Override
    public void eat() {
        System.out.println("中国人使用筷子吃饭");
    }
}