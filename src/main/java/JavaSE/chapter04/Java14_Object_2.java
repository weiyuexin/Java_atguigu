package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java14_Object_2
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/9 21:05
 */
public class Java14_Object_2 {
    public static void main(String[] args) {
        // TODO 面向对象
        byte b = 10;
        test(b); // bbb
        // byte => 8
        // short => 16
        // char => 16
        // int =>32

        // 基本数据类型在匹配方法时，可以在数值不变的情况下扩大数据的精度
        // byte类型无法和char类型做转换，原因是char没有负数，但是byte存在负数
    }
//    static void test(byte b){
//        System.out.println("bbb");
//    }
    static void test(short s){
        System.out.println("sss");
    }
    static void test(char c){
        System.out.println("ccc");
    }
    static void test(int i){
        System.out.println("iii");
    }
}
