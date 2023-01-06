package JavaEE.chapter03;

/**
 * @PackageName: JavaEE.chapter03
 * @ProjectName: Java_atguigu
 * @ClassName: Java05_FlowControl_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 19:54
 */
public class Java05_FlowControl_1 {
    // break : 跳出当前循环
    // continue : 跳过当前循环，继续执行下一次循环
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++ ){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++ ){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }
    }
}
