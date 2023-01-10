package JavaSE.chapter04;

/**
 * @PackageName: JavaSE.chapter04
 * @ProjectName: Java_atguigu
 * @ClassName: Java22_Object
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/10 22:17
 */
public class Java22_Object {
    public static void main(String[] args) {
        // TODO - 面向对象 - 接口
        // 接口：简单理解为规则
        // 基本语法：interface 接口名{ 规则属性，规则行为 }
        // 接口其实是抽象的，
        // 规则的属性必须为固定值，而且不能修改
        // 属性和行为的访问权限必修为公共的
        // 属性应该是静态的
        // 行为应该是抽象的

        // 接口和类是两个层面上的东西
        // 接口可以继承其他接口
        // 类的对象需要遵循接口，在java中，这个遵循称之为实现，也就是类需要实现接口，而且可以实现多个接口

        Computer computer = new Computer();
        Light light = new Light();
        computer.usb1 = light;
        Light light2 = new Light();
        computer.usb2 = light2;
        computer.powerSupply();
    }
}
interface USBInterface{

}
interface USBSupply extends USBInterface{
    public void powerSupply(); //抽象方法
}
interface USBReceive extends USBInterface{
    public void powerReceive();
}
class Computer implements USBSupply{
    public USBReceive usb1;
    public USBReceive usb2;

    @Override
    public void powerSupply() {
        System.out.println("电脑提供能源");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}
class Light implements USBReceive{

    @Override
    public void powerReceive() {
        System.out.println("电灯接收能源");
    }
}