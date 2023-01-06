package JavaEE.chapter04;

/**
 * @PackageName: JavaEE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java05_Object_Field
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 21:34
 */
public class Java05_Object_Field {
    public static void main(String[] args) {
        // TODO 面向对象 属性
        // 所谓的属性就是类的对象中的相同属性（特征）
        // 语法和变量的声明很像
        // 属性类型 属性名 = 属性值;
        // 如果在声明属性时同时进行了初始化，那么所以对象的属性值就完全相同
        // 所以如果希望每个对象的属性不一致，那么可以不用在声明属性时初始化
        // 属性会在构造对象时默认初始化，默认初始化的值取决于属性的类型
        // byte、short、int、long => 0
        // float、double => 0.1
        // boolean flag => false
        // char => 空字符
        // 引用数据类型(使用new创建) => null

        // 变量的作用域非常小，只在当前大括号内有效
        // 属性不只只在当前类中有效，而且可以随着对象在其他地方使用
        // 变量使用前必须初始化，否则会出错
        // 属性可以不用初始化，因为JVM会帮我们自动完成初始化（默认值）
    }
}
class User05{
    String name = "zhangsan";
}
