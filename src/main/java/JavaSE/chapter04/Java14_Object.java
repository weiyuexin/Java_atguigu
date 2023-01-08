package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java14_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 23:54
 */
public class Java14_Object {
    public static void main(String[] args) {
        // TODO 面向对象
        // 一个类中不能重复声明相同的属性和方法
        // 这里相同的方法指的是方法名、参数列表相同，和返回值类型无关
        // 如果方法名相同，但是参数列表（参数个数、顺序、类型）不相同，会认为是不同的方法，只不过名称一样
        // 这个操作在Java中称作 TODO 重载

        // 构造方法也存在方法的重载

        User14 user14 = new User14("zhangsan");
        user14.login(1111);
        user14.login("sgdhfdsa");
        user14.login("sdfgfh","213455");
    }
}
class User14{
    User14(){
        System.out.println("user...");
    }
    User14(String name){
        System.out.println("user..."+name);
    }
    void login(String account,String password){
        System.out.println("账号密码登录");
    }
    void login(int tel){
        System.out.println("手机验证码登录");
    }
    void login(String wx){
        System.out.println("微信登录");
    }
}
