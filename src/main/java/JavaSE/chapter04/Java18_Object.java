package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java18_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 21:18
 */
public class Java18_Object {
    public static void main(String[] args) {
        // TODO 面向对象 - 外部类 - 内部类
        // Java中不允许外部类使用private、protected修饰
        // 外部类：在源码中直接申明的类
        // 内部类：在类中声明的类

        // 内部类就当成外部类的属性使用即可

        // 因为内部类可以看作外部类的属性，所以需要构建外部类对象才可以使用

        // 创建外部类
        OuterClass outerClass = new OuterClass();
        // 创建内部类
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.name);


    }
//    private class InnerClass{
//
//    }
//    protected class InnerClass1{
//
//    }
}
class OuterClass{
    public class InnerClass{
        String name = "lisi";
    }
}
