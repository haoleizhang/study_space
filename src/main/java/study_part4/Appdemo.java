package study_part4;

/**
 * Created by biz on 2018/7/8.
 */
public class Appdemo {

    //AppDemo类依赖Subname类，所以先把Subname的字节码加载到JVM，所以优先执行Subname的静态代码块
    private static Appdemo ad = new Appdemo();//private static AppDemo ad = null;


    private Subname sn = new Subname();// private Subname sn = null;

    Appdemo(){
        //sn = new Subname();非static字段的初始化都是在构造器内，优先执行的。
        System.out.println("AppDemo构造器");
    }


    static{
        //静态字段的初始化都是在静态代码块内完成的
        //ad = new AppDemo();
        System.out.println("AppDemo内静态代码块");
    }

    public static void main(String[] args){
        System.out.println("hello");
    }

}

class Supername{

    Supername(){
        System.out.println("父类构造器");
    }
}

class Subname extends Supername{

    static{
        System.out.println("Subname内静态代码块");
    }

    Subname(){

//        super(); 默认会调用父类中的构造器
        System.out.println("Subname构造器");
    }

}