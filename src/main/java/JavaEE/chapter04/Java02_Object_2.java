package JavaEE.chapter04;

/**
 * @PackageName: JavaEE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java02_Object_2
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/6 21:03
 */
public class Java02_Object_2 {
    public static void main(String[] args) {
        // TODO 面向对象
        Teacher teacher = new Teacher();
        teacher.name = "张三";
        teacher.teach();
        Student student = new Student();
        student.name = "李四";
        student.study();
    }
}
class Teacher{
    String name;
    void teach(){
        System.out.println(name + "老师在讲课");
    }
}
class Student{
    String name;
    void study(){
        System.out.println("学生"+name+"在听课");
    }
}
