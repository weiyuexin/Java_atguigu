package JavaSE.chapter09;

/**
 * @PackageName: JavaSE.chapter09
 * @ProjectName: Java_atguigu
 * @ClassName: Java01_Thread
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/12 23:42
 */
public class Java01_Thread {
    public static void main(String[] args) {
        // TODO 线程
        // Thread是线程类
        // currentThread 获取当前正在运行的线程
        // getName 获取线程名称
        // main() 方法运行在main线程中
        System.out.println(Thread.currentThread().getName()); //main

        // TODO 创建线程
        //Thread t = new Thread();
        MyThread myThread = new MyThread();
        // TODO 启动线程
        myThread.start();
    }
}
// TODO 声明自定义线程类
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread:"+Thread.currentThread().getName());
    }
}
