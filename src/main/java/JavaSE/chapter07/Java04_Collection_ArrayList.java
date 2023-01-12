package JavaSE.chapter07;

import java.util.ArrayList;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java04_Collection_ArrayList
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/12 19:53
 */
public class Java04_Collection_ArrayList {
    public static void main(String[] args) {
        // TODO 集合 - Collection - List
        // ArrayList的常用方法
        ArrayList list = new ArrayList();

        list.add("zhangsan");
        list.add("lisi");
        list.add("zhangsan");
        list.add("wangwu");

        // add方法可以传递两个参数，第一个参数表示数据增加的位置（索引），第二个参数表示数据
        list.add(1,"赵六");

        ArrayList otherList = new ArrayList();
        otherList.add(1);
        otherList.add(2);
        otherList.add(3);
        list.addAll(otherList);

        // size()方法表示集合内部数据的数量
        System.out.println(list.size());

        // clear()清空集合中的数据
        // list.clear();

        // removeAll()删除指定集合中的数据
        list.removeAll(otherList);

        // isEmpty()判断集合中数据是否为空
        System.out.println(list.isEmpty());

        // contains()用于判断集合中是否存在某条数据，返回布尔类型的值
        System.out.println(list.contains("zhangsan"));

        // indexOf()用户获取数据在索引中的 第一个 位置，返回索引值，若不存在返回 -1
        System.out.println(list.indexOf("zhangsan"));
        // lastIndexOf()用户获取数据在索引中的 最后一个 位置，返回索引值，若不存在返回 -1
        System.out.println(list.lastIndexOf("zhangsan"));

        // toArray() 将集合转换成数组
        Object[] objects = list.toArray();
        System.out.println(list.toArray()[0]);

        // clone()复制新集合
        Object clone = list.clone();
        ArrayList newList = (ArrayList) clone;

        System.out.println(list);
        System.out.println(newList);

    }
}
