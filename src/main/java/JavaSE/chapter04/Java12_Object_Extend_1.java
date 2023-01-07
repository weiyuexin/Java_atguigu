package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java12_Object_Extend_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 21:08
 */
public class Java12_Object_Extend_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - 继承 -extend
        // 如果父类和子类有相同的属性，那么可以采用特殊的关键字区分
        // super & this
        // super 访问父类的属性和方法
        // this  访问当前类的属性和方法，默认可以不写

        Child1 c = new Child1();
        //System.out.println(c.name);
        c.test();

    }
}
class Parent1{
    String name = "zhangsan";
}
class Child1 extends Parent1{
    String name = "lisi";

    void test(){
        System.out.println(this.name);//lisi
        System.out.println(super.name);//zhangsan

    }

}