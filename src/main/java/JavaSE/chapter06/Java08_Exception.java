package JavaSE.chapter06;

/**
 * @PackageName: JavaSE.chapter06
 * @ProjectName: Java_atguigu
 * @ClassName: Java08_Exception
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/11 20:50
 */
public class Java08_Exception {
    public static void main(String[] args) throws Exception {
        // TODO 异常
        User8 user8 = new User8();
        int i = 10;
        int j = 0;
        try {
            user8.test(i,j);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class User8{
    // 如果方法中可能会出现问题，那么需要提前声明，告诉其他人，我的方法可能会出问题
    // 此时需要使用关键字 throws
    // 如果程序中需要手动抛出异常对象，那么需要使用throws关键字，然后new出异常对象
    public void test(int i,int j) throws Exception{
        try{
            System.out.println(i / j);
        }catch (ArithmeticException e){
            throw new Exception();
        }

    }
}
