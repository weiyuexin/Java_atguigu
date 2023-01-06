package JavaEE.chapter02;

/**
 * @PackageName: JavaEE.chapter02
 * @ProjectName: Java_atguigu
 * @ClassName: Java02_Identifier
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 13:47
 */
public class Java02_Identifier {
    public static void main(String[] args) {
        // TODO 标识符
        // 标识数据的符号，称之为标识符
        // 变量名称就是标识符
        // 标识符主要用于起名
        String name = "zhangsan";

        //TODO 标识符的命名规则
        // 1、英文拉丁字母
        String username = "zhangsan";
        String xingming = "lisi";
        // 2、符号 @ # % $
        // 标识符只能采用下划线和$符，其他符号不能使用，称之为特殊符号
        // 空格属于特殊符号，不能作为标识符使用
        String _name = "wangwu";
        String $name = "wangwu";
        String $na_me = "wangwu";
        System.out.println(_name);
        System.out.println($name);
        System.out.println($na_me);

        // 3、数字
        // 阿拉伯数字0-9可以作为标识符使用
        // 数字如果在标识符开头位置，那么会被识别为数字，而不是标识符，就会报错
        //String 7name = "jhh";
        String name1 = "jhh";

        // 4、在大括号范围内，标识符允许重复
        //String name = "jsdhfjk";
        // 标识符区分大小写
        String Name = "zhangsan";

        // 5、Java语言中预先定义了一些标识符，称之为关键字或保留字
        String Static = "dfg";

        // 6、驼峰命名法：规范
        String userName = "张三";

        // 7、标识符长度没有限制

        // 标识符可以使用中文
        String 名字 = "黑马";
        System.out.println(名字);
    }
}
