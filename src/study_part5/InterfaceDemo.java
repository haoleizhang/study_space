package study_part5;

import study_part4.IntegerDemo;

/**
 * Created by biz on 2018/7/15.
 * 接口的特点：
 * 1、接口没有构造方法，也不能显示定义构造器，不能实例化
 * 2、接口只能继承接口，不能继承类，接口支持多继承
 * 3、接口内的方法都是抽象方法，默认修饰符为public abstract
 * 4、接口内定义的常量实际上是公共的静态常量
 * 5、接口内定义的内部类实际上是公共的静态内部类
 */

class Subdemo {

}

abstract interface IWalkable { //abstract可以省略，默认会带上abstract，可以理解为抽象类

    //1、接口内部应该有构造方法
//    IWalkable(){};
    String name = "张三";
//    2、接口内定义的常量实际上是共同静态常量
//    public static final String name = "张三";

    void walk();

    //    3、接口中定义的方法时间上是公共抽象方法
//    等价于 public abstract void test();
    class test {

    }
//    4、接口内定义的内部类实际上是公共的静态内部类
//    public static class test{};
}

interface ISwimable {

    void swim();

}

//接口不能继承类，只能继承接口，可以继承多个接口
interface IAmphibious extends IWalkable, ISwimable {

}

public class InterfaceDemo extends Subdemo implements IAmphibious {

    //实现类比较实现接口内的抽象方法；并且用public修饰
    public void swim() {
        System.out.println("swim");
    }

    public void walk() {
        System.out.println("walk");
    }

    public static void main(String[] args) {

//        InterfaceDemo id = new InterfaceDemo();
        IAmphibious iAmphibious = new InterfaceDemo();//一般用多态来表示
        iAmphibious.swim();
        iAmphibious.walk();
    }
}
