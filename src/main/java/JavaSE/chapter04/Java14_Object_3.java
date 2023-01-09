package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java14_Object_3
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/9 21:14
 */
public class Java14_Object_3 {
    public static void main(String[] args) {
        // TODO 面向对象
//        AAA aaa = new AAA();
//        BBB aaa = new BBB();
        BBB aaa = new BBB(); //多态
        test(aaa);


        // 多态其实就是约束了对象的使用场景
        // 方法的重载： 方法名相同，参数列表不同（个数、顺序、类型）
        // 当找不到当前类型的方法时，会自动转换成上一级的类型匹配方法
        // AAA => Object
        // BBB => AAA

    }
    static void test(AAA aaa){
        System.out.println("aaa");
    }
    static void test(BBB bbb){
        System.out.println("bbb");
    }
}
class AAA{

}
class BBB extends  AAA{

}
