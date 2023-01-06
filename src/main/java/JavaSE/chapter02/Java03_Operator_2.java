package JavaSE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Operator_2
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 17:07
 */
public class Java03_Operator_2 {
    public static void main(String[] args) {
        // TODO 关系运算符
        // 比较两个数据之间关系的运算符
        // == != > >= < <=
        // 元素一 关系运算符[== != > >= < <=] 元素二  元素可以是数据或表达式
        // 关系表达式结果为布尔类型，true or false
        int i = 10;
        int j = 20;
        System.out.println(i == j); //false
        System.out.println(i != j); //true
        System.out.println(i > j); //false
        System.out.println(i >= j); //false
        System.out.println(i < j); //true
        System.out.println(i <= j); //true

    }
}
