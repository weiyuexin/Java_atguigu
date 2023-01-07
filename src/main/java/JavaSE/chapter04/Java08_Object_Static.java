package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java08_Object_Static
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 19:38
 */
public class Java08_Object_Static {
    public static void main(String[] args) {
        // TODO 面向对象 - static
        // 针对具体的对象的属性称之为对象属性、成员属性、实例属性
        // 针对具体的对象的方法称之为对象方法、成员方法、实例方法
        // 把和对象无关，只和类相关的称之为静态属性/方法
        Chinese c = new Chinese();
        c.name = "zhangsan";

        System.out.println("hello "+c.name+", " + c.nationality);

        //访问静态方法
        Bird.fly();
        System.out.println(Bird.type);
        Bird.type = "狗";
        System.out.println(Bird.type);
    }
}
class Bird{
    static String type = "鸟";
    //静态方法
    static void fly(){
        System.out.println("飞起来了");
    }
}
class Chinese{
    String name;

    String nationality = "中国";
}
