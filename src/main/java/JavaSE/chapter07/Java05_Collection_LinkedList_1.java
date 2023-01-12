package JavaSE.chapter07;

import java.util.LinkedList;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java05_Collection_LinkedList_1
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/12 20:57
 */
public class Java05_Collection_LinkedList_1 {
    public static void main(String[] args) {
        // TDOD 集合 - Colection - List
        // LinkedList : Linked(连接) + List
        // 创建集合对象
        LinkedList list = new LinkedList();
        //追加数据
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        // 向指定位置追加数据
        list.add(1,"zhaoliu");
        list.addFirst("张三");
        list.addLast("王五");

        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        // 向集合中添加集合
        list.addAll(list1);

        // 删除
        System.out.println(list.remove(1));
        System.out.println(list.remove()); //删除第一个
        list.removeFirst();
        list.removeLast();
        list.remove(0);

        // 集合大小 是否为空
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //清空集合
        //list.clear();

        // 判断数据是否存在
        list.contains("1");

        // 获取第一个数据
        list.element();
        // 判断数据所在位置
        list.indexOf("lisi");
        list.lastIndexOf("lisi"); //最后一个出现的位置

        // 在栈首添加
        list.push("aaaaa");
        // 删除栈首元素
        System.out.println(list.pop());

        System.out.println(list);

    }
}
