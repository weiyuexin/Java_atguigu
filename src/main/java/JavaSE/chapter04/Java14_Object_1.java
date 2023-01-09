package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java14_Object_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/9 20:59
 */
public class Java14_Object_1 {
    public static void main(String[] args) {
        // TODO 面向对象
        // 如果在一个构造方法中想要调用其他构造方法，那么需要使用关键字：this
        User14_1 uer1 = new User14_1();
        User14_1 uer2 = new User14_1("zhnagsan");
        User14_1 uer3 = new User14_1("zhangsan","男");
    }
}
class User14_1{
    User14_1(){
        this("zhangsan");
    }
    User14_1(String name){
        this(name,"男");
    }
    User14_1(String name,String sex){
        System.out.println(name + "," +sex);
    }
}
