package JavaSE.chapter06;

/**
 * @PackageName: JavaSE.chapter06
 * @ProjectName: Java_atguigu
 * @ClassName: Java09_Exception
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/11 21:00
 */
public class Java09_Exception {
    public static void main(String[] args) {
        // TODO 异常
        String account = "admin";
        String password = "admin";
        try {
            login(account,password);
        }catch (AccountException e){
            System.out.println("账号不正确，需要修改");
        }catch (PassWordException e){
            System.out.println("密码不正确，需要修改");
        }catch (LoginException e){
            System.out.println("其他登录的相关错误");
        }

    }
    public static void login(String account,String password) throws LoginException{
        if(!"admin".equals(account)){
            throw new AccountException("账号不正确");
        }
        if(!"admin".equals(password)){
            throw new PassWordException("密码不正确");
        }
        System.out.println("登录成功");
    }
}
// TODO 自定义异常
class LoginException extends Exception{
    public LoginException(String message) {
        super(message);
    }
}
class AccountException extends LoginException{

    public AccountException(String message) {
        super(message);
    }
}
class PassWordException extends LoginException{

    public PassWordException(String message) {
        super(message);
    }
}