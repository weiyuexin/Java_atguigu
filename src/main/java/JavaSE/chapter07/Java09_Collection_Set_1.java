package JavaSE.chapter07;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java09_Collection_Set_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/13 22:46
 */
public class Java09_Collection_Set_1 {
    public static void main(String[] args) {
        // TOTO 集合 -Collection -Set
        // HashSet 没有索引的概念
        HashSet set = new HashSet();

        ArrayList list =new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        set.addAll(list);

        Object[] objects = set.toArray();

        System.out.println(set.isEmpty());

        set.contains("zhangsan");

        System.out.println(set);
        System.out.println(set.size());
        Object clone = set.clone();
        System.out.println(clone);

        set.clear();
        System.out.println(set);
    }
}
