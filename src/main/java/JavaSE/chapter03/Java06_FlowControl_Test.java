package JavaSE.chapter03;

/**
 * @PackageName: JavaEE.chapter03
 * @ProjectName: Java_atguigu
 * @ClassName: Java06_FlowControl_Test
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 20:08
 */
public class Java06_FlowControl_Test {
    public static void main(String[] args) {
        // TODO 流程控制  -- 小练习
        int level = 9;
        for (int i=0;i<level;i++){
            for (int j=0;j<level-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
