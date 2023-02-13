package JavaSE.chapter09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @PackageName: JavaSE.chapter09
 * @ProjectName: Java_atguigu
 * @ClassName: Java05_Thread_Pool
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/13 16:49
 */
public class Java05_Thread_Pool {
    public static void main(String[] args) {
        // TODO 线程 - 线程池
        // 线程池：线程对象的容器
        // 可以根据需要，在启动时，创建一个或多个线程
        // Java中四种常见的线程池
        // 1、创建固定数量的线程对象
        //      ExecutorService 线程服务对象
        //ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 2、根据需求，动态创建线程
        //ExecutorService executorService = Executors.newCachedThreadPool();

        // 3、单一线程 可以实现某些工作按照一定顺序执行
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 4、定时调度线程
        //ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);


        /*for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }*/
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3");
            }
        });

        // 使用SingleThreadExecutor实现线程顺序执行
        executorService.submit(t1);
        executorService.submit(t3);
        executorService.submit(t2);
    }
}
