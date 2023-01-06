package JavaEE.chapter03;

/**
 * @PackageName: JavaEE.chapter03
 * @ProjectName: Java_atguigu
 * @ClassName: Java05_FlowControl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 19:38
 */
public class Java05_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制 - 重复执行
        // 根据条件重复执行某段代码
        // 1、while  有条件循环
        // while(条件表达式){需要循环的代码}
        // 基本执行原理：while循环会判断条件表达式的结果是否为true
        //      如果为false，跳出循环结果
        //      如果为true，会执行大括号内代码，代码执行完毕会重新对条件表达式进行判断
        int age = 30;
        while (age<40){
            System.out.println(age++);
        }
        // 2、do...while
        /*
        * 基本语法：
        * do{
        *     循环代码
        * }while(条件表达式)
        * */
        // 循环代码至少执行一次
        int age1 = 30;
        do{
            System.out.println(age1++);
        }while (age1<40);
        // 3、for
        /*
        for (初始化表达式;条件表达式;更新表达式){
            循环代码
        }
        */
        for (int i=1;i<40;i++){
            System.out.println("for执行"+i+"次");
        }
    }
}
