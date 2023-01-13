package JavaSE.chapter07;

import java.util.HashSet;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java09_Collection_Set
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/13 21:58
 */
public class Java09_Collection_Set {
    public static void main(String[] args) {
        // TODO 集合 - Collection - Set
        // HashSet: Hash + Set
        // Hash : 哈希算法，散列算法
        // ArrayList: 数组
        // LinkedList: 链表
        HashSet set = new HashSet();
        // TODO 增加数据
        set.add("zhangsan");
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");

        System.out.println(set);
        // TODO 修改数据  没有直接修改的方法  需要先删除后增加

        // TODO 删除数据
        //set.remove("zhangsan");
        System.out.println(set);

        // TODO 查询数据 没有对应的查询方法，只能遍历
        for (Object o:set){
            System.out.println(o);
        }
    }
}
