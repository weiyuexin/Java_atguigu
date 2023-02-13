package JavaSE.chapter09;

/**
 * @PackageName: JavaSE.chapter09
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Thread
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/13 14:27
 */
public class Java03_Thread {
    public static void main(String[] args) throws InterruptedException {
        // TODO 线程 - 休眠
        //Thread.sleep(3000); //在哪个线程中调用，哪个线程就会休眠
        while (true){ //每隔一秒休眠一次
            Thread.sleep(1000);
            System.out.println("main线程执行完毕");
        }
    }
}
