package JavaSE.chapter07;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java07_Collection_Generic
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/12 21:20
 */
public class Java07_Collection_Generic {
    public static void main(String[] args) {
        // TODO 泛型和类型的区别
        // 有时也把泛型称之为类型参数

        // 用于约束外部对象的使用场景，就是类型
        // 用于约束内部对象的使用场景，就是泛型

        MyContainer<User7> myContainer = new MyContainer();
        //myContainer.data = new Object();
        myContainer.data = new User7();
        //test(myContainer);

    }
    public static void test(MyContainer<Object> myContainer){
        System.out.println(myContainer);
    }

}
class MyContainer<T>{
    public T data;
}
class User7{

}
