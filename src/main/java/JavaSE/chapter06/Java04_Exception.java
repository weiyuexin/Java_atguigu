package JavaSE.chapter06;

/**
 * @PackageName: JavaSE.chapter06
 * @ProjectName: Java_atguigu
 * @ClassName: Java04_Exception
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/11 20:38
 */
public class Java04_Exception {
    public static void main(String[] args) {
        // TODO 异常
        // 3、索引越界 : java.lang.ArrayIndexOutOfBoundsException
        String[] names = new String[3];
        names[0] = "zhangsan";
        names[1] = "lisi";
        names[2] = "wangwu";
        if(names.length == 4){
            names[3] = "zhaoliu";
        }

        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        // 4、字符串索引越界: java.lang.StringIndexOutOfBoundsException
        String s = "abc";
//        System.out.println(s.charAt(3));
        System.out.println(s.substring(4));
    }
}
