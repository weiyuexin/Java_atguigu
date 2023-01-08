package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java13_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 23:42
 */
public class Java13_Object {
    public static void main(String[] args) {
        // TODO 面向对象 - 多态
        // 所谓的多态，其实就是一个对象在不同场景下表现出来的不同状态和形态
        // 多态语法其实就是对对象的使用场景进行了约束
        // 一个对象可以使用的功能取决与引用变量的类型
        Persion p = new Persion();
        Persion p1 = new Boy();
        Persion p2 = new Girl();
        p.say();
        p1.say();
        p2.say();
//        p1.sayBoy();
        Boy boy = new Boy();
        boy.sayBoy();
        boy.say();

        Girl girl = new Girl();
        girl.sayGirl();
        girl.say();
    }
}
class Persion{
    void say(){
        System.out.println("人");
    }
}
class Boy extends Persion{

    void sayBoy() {
        System.out.println("男人");
    }
}
class Girl extends Persion{
    void sayGirl() {
        System.out.println("女人");
    }
}