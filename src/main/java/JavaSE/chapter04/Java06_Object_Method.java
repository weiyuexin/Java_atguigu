package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java06_Object_Method
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/7 16:31
 */
public class Java06_Object_Method {
    public static void main(String[] args) {
        // TODO 面向对象  方法
        // 声明语法：  void 方法名(){ 逻辑代码 }
        // 调用方式：  对象.方法名()

        // 使用用户的账号和密码登录
        // 名词：用户 账号 密码
        // 动词：登录
        User06 user06 = new User06();
        boolean register = user06.register();
        if(register){
            System.out.println("注册成功");
            boolean login = user06.login();
            if (login){
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }
        }else {
            System.out.println("注册失败");
        }

    }
}
class User06{
    String account;
    String password;

    boolean register(){
        System.out.println("用户注册");
        return true;
    }

    boolean login(){
        System.out.println("用户登录");
        return true;
    }

}
