package study_part2;

/**
 * Created by biz on 2018/6/19.
 *
 * 帮助理解堆和栈的概念
 *
 * 基本数据类型的值传递机制，基本数据类型主要传递参数值
 *
 */
public class ParameterDemo {


    public static void main(String[] args){

        int demo = 10;
        System.out.println("最开始demo的值" + demo);//10

        change(demo);

        System.out.println("change方法调用之后的demo" + demo);//10
    }


    static void change(int demo){

        System.out.println("change方法里面未改变之前的demo" + demo);//10
        demo = 20;
        System.out.println("change方法里面改变后的demo" + demo);//20
    }
}
