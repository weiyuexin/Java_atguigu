package JavaSE.chapter04;

import JavaSE.chapter01.Java02_HelloWorld;

import java.util.*;
import java.sql.Date;
/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java10_Object_Import
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 20:28
 */
public class Java10_Object_Import {
    public static void main(String[] args) {
        // TODO 面向对象 - import
        // import主要用于在使用类前准备好类
        // import只能用在package后，class前
        // import可以使用多次，导入多个类
        // 如果同一个包中需要导入大量类，那么可以使用通配符*来简化操作
        // 如果import了不同包中相同名称的类，那么还是需要在使用时增加包名
        // java.lang 包由JVM自动导入
        String s;
        java.lang.String s1;

        java.util.Date d = new java.util.Date();
//        Date date = new Date();

        ArrayList<Object> objects = new ArrayList<>();

        // 当前包不需要导入，其他包需要导入
        new Java08_Object_Static_1();
        new User10();
        Java02_HelloWorld java02_helloWorld = new Java02_HelloWorld();

    }
}
class User10{

}