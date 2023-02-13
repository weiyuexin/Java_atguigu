package JavaSE.chapter09;

/**
 * @PackageName: JavaSE.chapter09
 * @ProjectName: Java_atguigu
 * @ClassName: Java01_Thread
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/12 23:42
 */
public class Java02_Thread {
    public static void main(String[] args) throws InterruptedException {
        // TODO 线程 - 执行方式（串行、并行）

        // 串行执行：多个线程连接成串，然后顺序执行
        // 并发执行：多个线程是独立的，谁抢到了CPU的执行权，谁就能执行

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

        // 将线程连接成串（串行执行），在前面加入的先执行，在后面加入的后执行
        t1.join(); //先把t1连接到主线程
        t2.join(); //再把t2连接到主线程



        System.out.println("main方法执行完毕");

    }
}
// 第一个线程
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread-1:"+Thread.currentThread().getName());
    }
}
// 第二个线程
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread-2:"+Thread.currentThread().getName());
    }
}
