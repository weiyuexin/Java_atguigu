package JavaSE.chapter03;

/**
 * @PackageName: JavaEE.chapter03
 * @ProjectName: Java_atguigu
 * @ClassName: Java02_FlowControl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 18:46
 */
public class Java02_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制-分支执行
        // 分支结构

        // 1、可选分支：单分支结构
        System.out.println("第一步");
        System.out.println("第二步");
        // 判断：条件表达式的结果是否为true，若为true，则执行分支逻辑，否则不执行
        int i = 10;
        if(i == 10){
            System.out.println("分支");
        }
        System.out.println("第三步");

        // 2、必选分支：双分支结构（二选一）
        System.out.println("第一步");
        System.out.println("第二步");
        int i1 = 10;
        if(i1 == 10){
            System.out.println("分支一");
        }else {
            System.out.println("分支二");
        }
        System.out.println("第三步");

        // 3、多分支:多重判断
        // if ... else if ... else
        System.out.println("第一步");
        System.out.println("第二步");
        int i2 = 20;
        if(i2 == 10){
            System.out.println("分支一");
        }else if (i2 == 20){
            System.out.println("分支二");
        }else {
            System.out.println("分支三");
        }
        System.out.println("第三步");
    }
}
