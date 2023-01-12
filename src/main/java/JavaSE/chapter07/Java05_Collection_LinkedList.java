package JavaSE.chapter07;

import java.util.LinkedList;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java05_Collection_LinkedList
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/12 20:32
 */
public class Java05_Collection_LinkedList {
    public static void main(String[] args) {
        // TODO 集合 - Collection - List
        // LinkedList : Linked(连接) + List
        // 创建集合对象
        LinkedList list = new LinkedList();

        // 增加第一个数据
        list.add("zhangsan");
        // 在链表首添加
        list.addFirst("lisi");
        // 在索引处添加
        list.add(1,"zhaoliu");
        // 在链表尾部添加
        list.addLast("wangwu");

        // TODO 获取数据
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // TODO 获取数据 遍历数据
        System.out.println(list.get(1));
        System.out.println("遍历");
        for(Object obj : list){
            System.out.println(obj);
        }

        // TODO 修改数据
        list.set(1,"赵六");

        // TODO 删除数据
        list.remove("wangwu");


        // 打印集合的数据
        System.out.println(list);

    }
}
