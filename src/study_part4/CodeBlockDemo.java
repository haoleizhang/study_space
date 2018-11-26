package study_part4;

/**
 * Created by biz on 2018/7/8.
 * 执行顺序：静态代码块>main方法>非静态代码块>构造器
 */
public class CodeBlockDemo {

    //非静态代码块
    {
        System.out.println("代码块");
    }

    //构造器

    CodeBlockDemo() {
        System.out.println("这个构造器");
    }

    //静态代码块----优先执行

    static {
        System.out.println("静态代码块");
    }


    public static void main(String[] args) {

        System.out.println("进入主方法");

        CodeBlockDemo cbd = new CodeBlockDemo();


        new CodeBlockDemo();


    }
}
