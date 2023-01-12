package JavaSE.chapter07;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @PackageName: JavaSE.chapter07
 * @ProjectName: Java_atguigu
 * @ClassName: Java08_Collection_Sort
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/12 21:29
 */
public class Java08_Collection_Sort {
    public static void main(String[] args) {
        // TODO 集合 - Collection - List
        // Sort 排序
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(0);
        System.out.println(list);

        // 排序需要传递一个实现了比较强接口的对象
        list.sort(new NumberComparator());
        System.out.println(list);
    }
}
class NumberComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // 如果第一个比第二个大，那么返回结果为正数，表示升序
        // return o1 - o2;
        // 如果第一个比第二个小，那么返回结果为负数，表示降序
        //return o2 - o1;
        // 如果第一个和第二个一样大，那么返回结果为0
        return 0;
    }
}