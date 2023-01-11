package JavaSE.chapter07;

import java.util.ArrayList;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java03_Collection_List
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/11 21:33
 */
public class Java03_Collection_List {
    public static void main(String[] args) {
        // TODO 集合 - Collection - List
        // ArrayList ： Array + List
        // TODO List：列表、清单
        //      按照数据的插入顺序进行存储
        // TODO Array ：数组、阵列

        // TODO 创建第一个集合对象：ArrayList
        ArrayList list = new ArrayList(3);
        // 1、不需要传递参数，直接new就可以，底层数组为空数组
        // 2、构造参数需要传递一个int类型的值，用于设定底层数组的长度
        // 2、构造参数需要传递一个Collection集合类型的值，用于将其他集合中的数据放置在当前集合

        // TODO 增加数据
        // add方法可以增加数据，只要将数据作为参数传递到add方法即可
        // 添加数据时，如果集合中没有任何数据，那么底层会创建长度为10的数组
        list.add(2);
        list.add("zhangsan");
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");

        // TODO 访问集合中数据
        // 获取集合中数据条数
        System.out.println(list.size());
        // 获取指定位置的数据
        System.out.println(list.get(1));
        // 遍历集合中数据
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }
        // TODO 如果循环遍历集合数据时，不关心数据的位置，那么可以采用特殊的for循环
        // for(循环对象:集合){}
        for (Object obj : list) {
            System.out.println(obj);
        }

        // TODO 修改数据
        // 将指定位置的数据进行修改，set方法需要传递2个参数，第一个参数是位置，第二个参数是修改的值
        // 方法返回结果，这个结果就是更新前的值
        Object oldVal = list.set(0, "wyx");
        System.out.println("修改前的值："+oldVal);

        // TODO 删除数据
        // 将指定位置的数据进行删除，remove方法需要传递2个参数，参数是数据的位置
        // 方法返回结果，这个结果就是删除前的值
        Object removedVal = list.remove(0);
        System.out.println("删除的值："+removedVal);

        // TODO 打印集合对象
        System.out.println(list);

    }
}
