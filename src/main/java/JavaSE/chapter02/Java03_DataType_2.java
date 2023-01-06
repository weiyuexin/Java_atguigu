package JavaSE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_DataType_2
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 15:10
 */
public class Java03_DataType_2 {
    public static void main(String[] args) {
        // TODO 数据类型的转换

        String name = "zhangsan";
        int age = 30;

        name = "lisi";

        //name = age;

        //byte -> short -> int -> long -> float -> double
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        float f = lon;
        double d = f;

        // Java中范围小的数据可以转换为范围大的数据
        // 如果想要把范围大的数据转换为范围小的数据，需要使用小括号进行强制类型转换
        int i1 = (int)d;




    }
}
