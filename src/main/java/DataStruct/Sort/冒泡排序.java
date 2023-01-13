package DataStruct.Sort;

import java.util.Scanner;

/**
 * @PackageName: DataStruct.Sort
 * @ProjectName: Java_atguigu
 * @ClassName: 冒泡排序
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/13 19:34
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        // 思想：以升序排序为例，从后往前遍历数组，比较i和i-1个数据，如果a[i]小于a[i-1]，
        // 那么交换其数据，遍历完一遍后，数组第一个元素就是最小的元素，然后在从数组
        // 第二个元素开始遍历，判断，直到最后一个元素，如果第一趟遍历没有交换数据，则可以直接退出循环（因为数组是有序的）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组元素个数:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("请依次输入数组元素");
        for (int i=0 ;i < n; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println("冒泡排序");
        boolean flag = false;
        for (int i=0;i<n;i++){
            for (int j = n-1;j>i; j--){
                if (nums[j] < nums[j-1]){
                    // 交换两个数据
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    // 是否交换过
                    flag = true;
                }
            }
            if (!flag){ //如果第一轮没有交换，那么后面的循环都退出
                break;
            }
        }
        System.out.println("排序后:");
        for (int i=0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
