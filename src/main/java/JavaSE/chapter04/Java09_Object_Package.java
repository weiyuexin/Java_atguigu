package JavaSE.chapter04;


/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java09_Object_Package
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 20:15
 */
public class Java09_Object_Package {
    public static void main(String[] args) {
        // TODO 面向对象 - package - 包

        // package 中容纳类
        // 主要用于分类管理
        // 基本语法： package 包完整路径;
        // java.lang.Object

        // 一个类可以没有包，但是package不能在同一个源码文件中使用多次
        // 包名为了区分类名，所以一般都是小写
        // Java中存在不同包的相同名称的类，可以使用包进行区分
        // 一般情况下，在使用类的情况下，我们都会使用类的全名（包名+类名）
        new java.util.Date();

    }
}
