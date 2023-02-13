package JavaSE.chapter09;

/**
 * @PackageName: JavaSE.chapter09
 * @ProjectName: Java_atguigu
 * @ClassName: Java07_Thread_Safe
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/13 23:22
 */
public class Java07_Thread_Safe {
    public static void main(String[] args) {
        // TODO 线程 - 线程安全
        // 所谓的线程安全问题，其实就是多个线程在并发执行时，修改了共享内存中的共享对象的属性，导致的数据冲突问题
        User7 user7 = new User7();
        Thread t1 = new Thread(()->{
            user7.name = "zhangsan";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user7.name);
        });
        Thread t2 = new Thread(()->{
            user7.name = "lisi";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user7.name);
        });
        t1.start();
        t2.start();
        System.out.println("main线程执行完毕");

    }
}
class User7{
    public String name;
}
