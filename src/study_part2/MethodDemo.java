package study_part2;

/**
 * Created by biz on 2018/6/14.
 * method方法
 * 方法是指特定的功能操作，程序中完成独立功能，可以充分使用的一段代码集合
 * 如果方法使用了static,可以直接使用类名.方法（参数）
 * 如果方法没有使用static,要使用类的对象来调用方法
 * Main方法是由JVM调用
 *
 *
 * 方法定义的位置
 * 1、在类中定义，类是java的最小程序单元
 * 2、方法不能定义在 方法中，方法和方法是兄弟关系
 * 3、方法定义的先后顺序不影响
 */
public class MethodDemo {


    static void doWork(){
        System.out.println("共同的代码块-----------");
    }

    public static void main(String []args){

        System.out.println("代码块A");
        MethodDemo.doWork();//static修饰的方法可以直接用类名.方法名(参数)直接调用
        System.out.println("代码块B");
        System.out.println("代码块C");
        System.out.println("代码块D");
    }
}
