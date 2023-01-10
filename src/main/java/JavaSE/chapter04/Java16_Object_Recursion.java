package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java16_Object_Recursion
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 20:16
 */
public class Java16_Object_Recursion {
    public static void main(String[] args) {
        // TODO 面向对象 - 递归
        // 所谓的递归：方法调用自身，称之为递归方法
        int result = computeAP(10);
        System.out.println(result);

        // 阶乘 ： 5!
        // 0的阶乘为1
        // 一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        System.out.println(jiecheng(5));

        // 1、 递归方法应该有跳出的逻辑，否则会出错：StackOverflowError
        // 2、调用自身时，传递的参数需要有规律
    }
    public static int computeAP(int num){
        num = num % 2 == 0 ? num -1 : num;
        if(num == 1){ //执行边界
            return 1;
        }else {
            return num + computeAP(num -2);
        }
    }
    public static int jiecheng(int num){
        if (num == 1 || num == 0){
            return 1;
        }else {
            return num * jiecheng(num - 1);
        }
    }
}
