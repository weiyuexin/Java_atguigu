package JavaEE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Operator_3
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 17:43
 */
public class Java03_Operator_3 {
    public static void main(String[] args) {
        // TODO 逻辑运算符
        // 用于描述多个条件表达式之间的关系的运算符
        // 基本语法结构
        // 变量 = (条件表达式1) 逻辑运算符 (条件表达式2)
        // 结果的变量的类型依然为布尔类型

        // & : 与运算  两个都为true则为true，否则全为false
        int i = 10;
        boolean result = (i > 5) & (i<20);
        System.out.println(result); //true

        // | : 或运算  一个为true则为true
        int i1 = 10;
        boolean result1 = (i < 5) & (i > 20);
        System.out.println(result1); //true

        // && : 短路与运算  先判断第一个表达式，若为false，则不会判断第二个表达式
        int i2 = 10;
        int j = 20;
        boolean res = (i2>=10) && (++j>30);
        System.out.println(res);
        System.out.println("j = "+j);

        // || : 短路或运算  先判断第一个表达式，若为true则不判断第二个表达式，否则继续判断第二个表达式
        int i3 = 10;
        int j3 = 20;
        boolean res3 = (i3>=10) || (++j3>30);
        System.out.println(res3);
        System.out.println("j3 = "+j3);

        // TODO ! : 逻辑非运算，即相反
        int i4 = 10;
        boolean res4 = i ==10;
        System.out.println(!res4);
    }
}
