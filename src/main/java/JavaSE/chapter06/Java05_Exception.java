package JavaSE.chapter06;

/**
 * @PackageName: JavaSE.chapter06
 * @ProjectName: Java_atguigu
 * @ClassName: Java05_Exception
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/11 20:44
 */
public class Java05_Exception {
    public static void main(String[] args) {
        // TODO 异常
        // 5、格式化异常：java.lang.NumberFormatException
//        String s = "a123";
////        Integer i = (Integer) s;
//        Integer i = Integer.parseInt(s);
//        System.out.println(i);

        // 6、类型转换异常：java.lang.ClassCastException
        Object obj = new User5();
        if(obj instanceof Emp5){ //判断obj是不是Emp5类型的对象
            Emp5 emp = (Emp5) obj;
        }

    }
}
class User5{

}
class Emp5{

}
