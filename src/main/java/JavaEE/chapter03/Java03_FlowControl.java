package JavaEE.chapter03;

/**
 * @PackageName: JavaEE.chapter03
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_FlowControl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 19:15
 */
public class Java03_FlowControl {
    public static void main(String[] args) {
        // TODO 特殊的分支结构
        System.out.println("第一步");
        System.out.println("第二步");
        int i = 20;
        switch (i){
            case 10:
                System.out.println("分支1");
//                break;
            case 20:
                System.out.println("分支2");
//                break;
            case 30:
                System.out.println("分支3");
//                break;
            default:
                System.out.println("默认分支");
        }
        System.out.println("第三步");
    }
}
