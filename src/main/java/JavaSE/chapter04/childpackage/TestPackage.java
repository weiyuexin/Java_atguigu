package JavaSE.chapter04.childpackage;

import JavaSE.chapter04.Java17_Object_Access;

/**
 * @PackageName: JavaSE.chapter04.childpackage
 * @ProjectName: Java_atguigu
 * @ClassName: TestPackage
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 20:57
 */
public class TestPackage {
    public static void main(String[] args) {
        Java17_Object_Access user17 = new Java17_Object_Access();
       // System.out.println(user17.name); //错误
        System.out.println(user17.username); //对
       // System.out.println(user17.sex); //错误，不在同一包下
//        System.out.println(user17.age);
    }
}
