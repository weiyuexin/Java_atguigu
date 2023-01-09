package JavaSE.chapter04;

import java.util.ArrayList;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java15_Object_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/9 21:37
 */
public class Java15_Object_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - 重写
        CCC ccc = new CCC();
//        DDD ddd = new DDD();
        CCC ddd = new DDD();
        System.out.println(ccc.sum());
        // 一个对象能使用什么方法（属性），取决于引用变量的类型
        // 一个对象的方法具体使用（直接、间接）是需要看具体的（new的）对象的，new 的是子类的话，在使用是会先去找子类中的方法，找不到的话才会去找父类的方法
        // 一个对象的属性具体使用是不需要看具体的对象的，属性在哪里声明在哪里使用
        System.out.println(ddd.sum());

    }
}
class CCC{
    int i = 10;

//    int sum(){
//        return i + 10;
//    }
    int sum(){
        return getI() + 10;
    }
    int getI(){
        return i;
    }
}
class DDD extends CCC{
    int i = 20;
//
//    int sum(){
//        return i + 20;
//    }
    int getI(){
        return i;
    }
}
