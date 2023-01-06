package JavaEE.chapter04;

/**
 * @PackageName: JavaEE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java01_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 20:25
 */
public class Java01_Object {
    public static void main(String[] args) {
        // TODO 面向对象
        // 所谓面向对象，就是分析问题时，以问题所涉及的事物为中心进行分析的方式
        // 类和对象
        // 类表示归纳和整理
        // 对象表示具体的事物
        // TODO class(类)
        /*
        类的基本语法结构：
        class 类名{
            特征（属性）;
            功能（方法）;
        }

        创建对象的语法：
        new 类名();
        * */

        // 问题：做一道菜  红烧排骨
        // 类：菜  对象：红烧排骨

        // TODO 1、先声明类
        // TODO 2、创建对象
        // TODO 3、声明属性，所谓属性就是类中的变量
        //       属性类型 属性名称 = 属性值;
        // TODO 4、声明方法
        //       void 方法名(参数){功能代码}
        // TODO 5、执行方法
        //       对象.属性
        //       对象.方法();
        Cooking c = new Cooking();
//        c.name = "红烧排骨";
//        c.food = "排骨";
        c.setName("红烧排骨");
        c.setFood("排骨");
        Cooking c1 = new Cooking("红烧🐟", "🐟");

        System.out.println(c.toString());
        System.out.println(c1.toString());

        c.execute();
        c1.execute();
    }
}
class Cooking{
    // 特征（属性）
    // 名字
    String name;
    // 菜的类型
    String type = "红烧";
    // 食材
    String food;
    // 佐料
    String relish = "大料 酱油 糖";

    /**
     * 构造函数
     * @param name
     * @param type
     * @param food
     * @param relish
     */
    public Cooking(String name, String type, String food, String relish) {
        this.name = name;
        this.type = type;
        this.food = food;
        this.relish = relish;
    }

    /**
     * 空构造函数
     */
    public Cooking() {

    }

    /**
     * 构造函数
     * @param name
     * @param food
     */
    public Cooking(String name, String food) {
        this.name = name;
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cooking{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", food='" + food + '\'' +
                ", relish='" + relish + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getRelish() {
        return relish;
    }

    public void setRelish(String relish) {
        this.relish = relish;
    }

    // 申明方法
    void execute(){
        System.out.println("准备食材:"+food);
        System.out.println("准备佐料:"+relish);
        System.out.println("开始烹饪");
        System.out.println(name+"烹饪完成");
    }
}
