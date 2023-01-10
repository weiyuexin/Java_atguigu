package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java24_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 22:48
 */
public class Java24_Object {
    public static void main(String[] args) {
        // TODO 面向对象 - 匿名类
        // 在某些场合下，类的名字不重要，我们只想使用类中的方法或功能，那么我们可以采用特殊的语法：匿名类
        // 匿名类：没有名字的类
        // 接口也可以使用匿名类实现
        Me me = new Me();
//        me.sayHello(new Lisi());
        me.sayHello(new Person24() { //使用匿名类
            @Override
            public String name() {
                return "王五";
            }
        });
        me.sayHello(new Person24() {
            @Override
            public String name() {
                return "赵六";
            }
        });
        new Bird24().fly();
        new Fly(){ //使用匿名类实现接口
            @Override
            public void fly() {
                System.out.println("人使用飞机飞行");
            }
        }.fly();
    }
}
interface Fly{
    public void fly();
}
class Bird24 implements Fly {

    @Override
    public void fly() {
        System.out.println("鸟使用翅膀飞翔");
    }
}
abstract class Person24{
    public abstract String name();
}
class Me{
    public void sayHello(Person24 person24){
        System.out.println("Hello "+ person24.name());
    }
}
class Zhangsan extends Person24{

    @Override
    public String name() {
        return "张三";
    }
}
class Lisi extends Person24{

    @Override
    public String name() {
        return "李四";
    }
}