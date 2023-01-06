package JavaEE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Operator
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 15:19
 */
public class Java03_Operator {
    public static void main(String[] args) {
        // TODO 运算符
        // 参与数据运算的符号，Java定义的，无法自行定义

        // TODO 表达式
        // 采用运算符和数据连接到一起，形成的符合Java语法规范的指令代码

        // TODO 算术运算符
        // 1、二元运算符：两个元素参与运算
        // 结果的类型是两个元素中类型最大的哪一种，最小使用的类型为int类型
        System.out.println(1 + 2); //3
        System.out.println(2 - 2); //0
        System.out.println(3 * 2); //6
        System.out.println(4 / 2); //2
        System.out.println((double) 1 / 2); //0.5
        System.out.println(1 / 2); //0
        System.out.println(5 % 2); //1 取余/模运算

        byte b1 = 10;
        byte b2 = 20;
        int asn = b1 + b2; //(byte + byte) => int  最小使用的类型是int类型
        byte b3 = (byte) (b1 + b2); //强制类型转换
        // 2、一元运算符：一个元素参与运算
        // ++ --
        int i = 0;
        int j = ++i;
        System.out.println("i = "+i);
        System.out.println("j = "+j);

        int i1 = 0;
        int j1 = i1--;
        System.out.println("i1 = "+i1);
        System.out.println("j1 = "+j1);

    }
}
