package JavaSE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java01_Variable
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 13:38
 */
public class Java01_Variable {
    public static void main(String[] args) {
        // TODO 变量
        // 所谓的变量就是可以改变的向量存储
        // 1、变量的申明
        // 数据类型 变量名称;
        String name;
        // 2、变量的赋值
        // 变量名称 = 数据;
        name = "Java";
        // 3、变量的使用
        // 直接访问变量名称即可
        System.out.println(name);

        //将变量的申明和赋值一起使用
        String user = "zhangsan";
        System.out.println(user);

        // 在使用变量之前，必需进行赋值 ，将这个操作称之为变量的初始化
        String email = "34324@qq.com";
        System.out.println(email);

    }
}
