package JavaEE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Operator_4
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 18:30
 */
public class Java03_Operator_4 {
    public static void main(String[] args) {
        // TODO 三元运算符
        // 变量 = （条件表达式） ? (任意表达式1) : (任意表达式2)
        // 运算规则：判断条件表达式的结果，若为true则执行任意表达式1，若为false，则执行任意表达式2
        int i = 10;
        int j = 20;
        String res = i < j ? "真" : "假";
        System.out.println(res);

    }
}
