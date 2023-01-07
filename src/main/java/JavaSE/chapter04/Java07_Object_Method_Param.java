package JavaSE.chapter04;

import java.util.Arrays;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java07_Object_Method_Param
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 18:15
 */
public class Java07_Object_Method_Param {
    public static void main(String[] args) {
        // TODO 面向对象 - 方法
        // 使用外部数据控制方法内部的实现的操作，使用的是参数语法实现，也叫方法参数
        // 语法：方法名( 参数类型  参数名称 )
        User07 user07 = new User07();
        // 传递参数
        user07.sayHello("Janny",11);

        // 当参数的个数不确定，但是类型相同时，可以采用特殊的参数语法声明：可变参数
        //    如果参数中还有其他含义的参数，那么可变参数应该声明在最后
        // 语法：参数类型... 参数名称
        //user07.test(12);
        //user07.test(13,"zhangsan");
        user07.test(23,"zhangsan","lisi","wangwu");
    }
}
class User07{
    void sayHello(String name, int age){
        // 使用参数
        System.out.println("Hello " + name + ", 年龄："+age);
    }

    // 可变参数
    void test(int age,String... name){
        System.out.println(name);
        System.out.println(age);
    }
}
