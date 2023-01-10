package JavaSE.chapter03;

import JavaSE.chapter04.Java17_Object_Access;


/**
 * @PackageName: JavaEE.chapter03
 * @ProjectName: Java_atguigu
 * @ClassName: Java01_FlowControl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 18:36
 */
public class Java01_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制
        // 所谓流程控制就是计算机执行代码时，对指令代码执行顺序的控制
        // Java中流程控制主要分为3种：
        // 1、顺序执行：代码出现的先后顺序以及语法的先后顺序
        // 变量使用前，必须申明和初始化
        int i = 10;
        int j = 20;
        System.out.println(i + j);
        // 2、分支执行
        // 分支结构

        // 3、重复执行


        // 权限检验
        Java17_Object_Access user17 = new Java17_Object_Access();
//        System.out.println(user17.name); //错误
        System.out.println(user17.username); //对
//        System.out.println(user17.sex); //错误，不在同一包下
    }
}
