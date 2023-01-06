package JavaSE.chapter04;

/**
 * @PackageName: JavaEE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java02_Object_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 20:59
 */
public class Java02_Object_1 {
    public static void main(String[] args) {
        // TODO 面向对象
        // 狗：两只，小黑，小白
        Dog dog1 = new Dog();
        dog1.color = "white";
        dog1.name = "小白";
        dog1.run();
        Dog dog2 = new Dog();
        dog2.color = "black";
        dog2.name = "小黑";
        dog2.run();
    }
}
class Dog{
    //属性
    String color;
    String name;
    //方法
    void run(){
        System.out.println(name + " 跑开了");
    }
}