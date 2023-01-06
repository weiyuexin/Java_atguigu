package JavaSE.chapter04;

/**
 * @PackageName: JavaEE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java02_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 20:54
 */
public class Java02_Object {
    public static void main(String[] args) {
        // TODO 面向对象

        // 类：动物
        // 对象：猫、狗
        Animal cat = new Animal();
        cat.type = "猫";
        cat.name = "小黑";
        cat.run();
        Animal dog = new Animal();
        dog.type = "狗";
        dog.name = "大黄";
        dog.run();
    }
}
class Animal{
    //属性
    String type;
    String name;

    //方法
    void run(){
        System.out.println(type + " " + name + " 跑开了");
    }
}
