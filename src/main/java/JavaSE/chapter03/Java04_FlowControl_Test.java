package JavaSE.chapter03;

/**
 * @PackageName: JavaEE.chapter03
 * @ProjectName: Java_atguigu
 * @ClassName: Java04_FlowControl_Test
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 19:30
 */
public class Java04_FlowControl_Test {
    public static void main(String[] args) {
        // TODO 分支执行-小练习
        int age = 30;
        if(age < 7){
            System.out.println("儿童");
        } else if (age >=7 && age<18) {
            System.out.println("少年");
        } else if (age >= 18 && age <41) {
            System.out.println("青年");
        } else if (age >= 41 && age <66) {
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }

        if(age < 7){
            System.out.println("儿童");
        } else if (age<18) {
            System.out.println("少年");
        } else if (age <41) {
            System.out.println("青年");
        } else if (age <66) {
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }
    }
}
