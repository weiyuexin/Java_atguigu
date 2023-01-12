package JavaSE.chapter07;

import java.util.ArrayList;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java06_Collection
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/12 21:08
 */
public class Java06_Collection {
    public static void main(String[] args) {
        // TODO 集合 - Collection
        // 泛型：
        ArrayList<Person6> list = new ArrayList<Person6>();

        // 多态 ：限定对象的使用场景
        //Person6 user = new User6();
//        user.testUser();
       // user.testPerson();
        Person6 person6 = new Person6();
        User6 user6 = new User6();
        list.add(person6);
        //list.add(user6);

        //list.remove(0);

        // 从集合中获取的对象类型为Object
        // Object o = list.get(0);
        // 如果想要执行对象的方法，那么需要强制类型转换
        /*if (o instanceof Person6){ //判断o是否为Person6类型
            Person6 person61 = (Person6) o;
            ((Person6) o).testPerson();
        }*/
        Person6 person61 = list.get(0); // 使用泛型约束后，直接取到的就是Person6类型的数据
        person61.testPerson();


    }
}
class Person6{
    public void testPerson(){
        System.out.println("person...");
    }
}
class User6 {
    public void testUser(){
        System.out.println("user....");
    }
}
