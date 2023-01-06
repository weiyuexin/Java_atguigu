package JavaEE.chapter04;

/**
 * @PackageName: JavaEE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java04_Object_Class
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 21:17
 */
public class Java04_Object_Class {
    public static void main(String[] args) {
        // TODO 面向对象
        // 类 ：结构体：包含属性（特征）和方法（行为）
        //     会有很多对象
        // class  关键字小写
        // 类名 ：标识符，遵循标识符命名规则，一般情况下类型首字母大写（规范）

        // 对象：类的实例化（具象化）
        //      new 类名()   小括号必须写
        //      new也是关键字，表示创建一个具体的对象，而且使用一次创建一次，每次都是全新的
        //      一般new出来的对象会赋值给变量，方便重复使用
        //      变量的类型就是对象的类型
        User04 user = new User04();

        /**
         内存：
            栈：存放方法、变量
            堆：存放对象
            源空间：存放类的信息

         对象是将内存地址赋值给了变量所以变量其实引用了内存中的对象，所以称之为引用变量
         而变量的类型称之为引用数据类型（使用new创建的变量都是引用数据类型）
         */

        // 特殊的对象：空对象，没有引用的对象，称之为空对象，null称之为关键字对象
        // 所以引用类型变量的默认值就是null
        User04 user01 = null;
    }
}
class User04{

}
