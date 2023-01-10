package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java23_Object_Enum
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 22:34
 */
public class Java23_Object_Enum {
    public static void main(String[] args) {
        // TODO 面向对象 - 枚举
        // 枚举是一个特殊的类，其中包含了一组特定对象，这些对象不会发生变化,一般都是以大写的标识符
        // 枚举使用Enum关键字使用
        // 枚举类会将对象放置在最前面，那么和后面的语法需要使用分号隔开
        // 枚举类不能创建对象，它的对象是在内部自行创建
        System.out.println(City.BEIJING.name);
        System.out.println(City.SHNAGHAI.code);
        System.out.println(MyCity.SHANGHAI.name);
        System.out.println(MyCity.BEIJING.name);

    }
}
class MyCity{ //自己实现枚举类
    public String name;
    public int code;
    private MyCity(String name,int code){
        this.name = name;
        this.code = code;
    }
    public static final MyCity BEIJING = new MyCity("北京",1001);
    public static final MyCity SHANGHAI = new MyCity("上海",1002);
}
enum City{
    BEIJING("北京",1001),SHNAGHAI("上海",1002);
    City(String name,int code){
        this.name = name;
        this.code = code;
    }
    public String name;
    public int code;
}
