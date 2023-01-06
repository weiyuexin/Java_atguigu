package JavaSE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Operator_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 16:00
 */
public class Java03_Operator_1 {
    public static void main(String[] args) {
        // TODO 赋值运算符
        // 赋值需要考虑类型关系
        // = += -= *= /= %=
        String name = "zhangsan";

        // TODO 复合赋值运算符
        int i = 1;
        i += 1;
        System.out.println("i = "+i);

        // 如果使用了复合赋值运算符，那么数据的类型不会发生变化
        byte b1 = 10;
        // byte b2 = b1 + 10; //默认最小运算是int
        b1 +=10;
        System.out.println("b1 = "+b1);

    }
}
