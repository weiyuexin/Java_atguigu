package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java12_Object_Extend
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 20:56
 */
public class Java12_Object_Extend {
    public static void main(String[] args) {
        // TODO 面向对象 - extend - 继承

        // 面向对象编程中有三个非常重要的特征：继承、封装、多态
        // 类存在父子关系：子类可以直接获得父类的成员属性和成员方法
        // 类的继承只能是单继承，一个类只能有一个父类，不能存在多个父类
        // 一个父类可以存在多个子类

        // 继承采用extend语法： class 子类 extend 父类{}

        Child child = new Child();
        System.out.println(child.name);
        child.test();
    }
}
class Parent{
    String name = "zhangsan";
    void test(){
        System.out.println("test");
    }
}
class Child extends Parent{
    @Override
    void test() {
        System.out.println("child test");
    }
}
