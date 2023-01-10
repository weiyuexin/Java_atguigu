package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java17_Object_Access_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 21:04
 */
public class Java17_Object_Access_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - 访问权限

        // private：同类可以使用
        // default(包路径访问权限)：同类、同包（路径）
        // protected：同类、同包（路径）、子类
        // public：公共的
        // 所谓的访问权限，其实就是访问属性、方法的权力和限制
        // 谁访问 Java17_Object_Access_1 -> super -> java.lang.Object
        // 访问谁的 Persion17 -> super -> java.lang.Object
        // 这里不能访问persion17.clone()是因为persion17 和 Java17_Object_Access_1的对应的父类Object不是同一个
        Person17 person17 = new Person17();
        // person17.clone();
    }
}
class Person17{
    void test() throws CloneNotSupportedException {
        clone();
    }
}
