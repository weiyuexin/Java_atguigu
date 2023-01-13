package JavaSE.chapter07;

import java.util.HashSet;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java09_Collection_Set_2
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/13 22:51
 */
public class Java09_Collection_Set_2 {
    public static void main(String[] args) {
        // TODO 集合 - Collection -Set
        // HastSet底层数据结构为 ：数组 + 链表
        // 当HashCode值一致时，使用equals方法判断两个对象是否是同一个，若是则不会放入集合，若不相同，则使用链表的形式连接到前一个元素后面
        HashSet set = new HashSet();

        User9 user1 = new User9();
        user1.id = 1001;
        user1.name = "zhangsan";
        System.out.println(user1.hashCode());
        User9 user2 = new User9();
        user2.id = 1001;
        user2.name = "zhangsan";
        System.out.println(user2.hashCode());
        User9 user3 = new User9();
        user3.id = 1002;
        user3.name = "lisi";

        set.add(user1);
        set.add(user2);
        set.add(user3);

        // user1 和user2其实不是相同的对象

        System.out.println(set);

    }
}
class User9{
    public int id;
    public String name;

    @Override
    // 类似与内存地址
    public int hashCode() {
        return id;
    }

    @Override
    // 判断两个对象的属性是否完全相同
    public boolean equals(Object obj) {
        if (obj instanceof User9){
            User9 otherUser = (User9) obj;
            if (otherUser.id == this.id){
                if (otherUser.name.equals(this.name)){
                    return true;
                }
            }
            return false;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User9{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
