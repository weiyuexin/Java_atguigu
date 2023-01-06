package JavaSE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_DataType_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 15:01
 */
public class Java03_DataType_1 {
    public static void main(String[] args) {
        // TODO 基本数据类型
        // 1、整数类型
        // byte :8位
        byte b = 10;
        // short :16位
        short s = 10;
        // int : 32位
        int i = 10;
        // long :64位
        long lon = 10;

        //2、浮点类型：含有小数点的数据类型
        // 根据计算精度分为：
        // 默认情况下，小数点会被识别为精度较高的双精度double类型
        // float ：单精度浮点类型,需要使用F(f)结尾
        float f = 1.0f;
        System.out.println(f);
        // double ：双精度浮点类型
        double d = 2.0;

        // 3、字符类型
        // 所谓的字符类型其实就是使用符号标识文字内容
        char c = 'a';

        // 4、布尔类型
        // true or false
        boolean bln = true;

    }
}
