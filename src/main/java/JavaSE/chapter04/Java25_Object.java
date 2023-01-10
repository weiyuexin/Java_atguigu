package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java25_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 23:01
 */
public class Java25_Object {
    public static void main(String[] args) {
        // TODO 面向对象 - bean规范
        // 1、主要用于编写逻辑
        // 2、主要用于建立数据模型（Bean）

        // TODO Bean类的设计规范：Bean规范
        // 1、类要求必须含有无参、公共的构造方法
        // 2、属性必须私有化，然后提供公共的get和set方法

        User25 user = new User25();
        user.setAccount("admin");
        user.setPassword("admin");
        System.out.println(login(user));

    }
    public static boolean login(User25 user){
        if (user.getAccount().equals("admin") && user.getPassword().equals("admin")){
            return true;
        }
        return false;
    }
}
class User25 { //数据模型/bean类
    private String account; //属性不应该可以直接访问
    private String password;

    public User25() {
    }

    public User25(String account) {
        this.account = account;
    }

    public User25(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User25{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
