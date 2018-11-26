package study_part5;

/**
 * Created by biz on 2018/7/16.
 * 内部类（可以理解为外部类的一个状态）
 * 实例内部类：没有被static修饰的的内部类，说明内部类属于外部类对象，不属于外部类本身
 * 实例内部类的特点：
 *      1、当创建内部类对象时，应该现有外部类对象，通过外部类对象来创建内部类对象
 *      2、实例内部类可以直接访问外部类成员
 *      3、外部类中不能直接访问内部类的成员
 *      4、实例内部类中成员不能用static修饰，只能有实例成员
 *      5、如果实例内部类和外部类存在同名的字段或者方法abc，在内部类中用this.abc表示访问内部类成员,外部类.this.abc表示调用外部类成员
 *
 *  静态内部类：表示用static修饰过的内部类，属于外部类，不属于外部类的对象
 *  静态内部类的特点：
 *      1、在创建内部类的实例时，不需要创建外部类的实例
 *      2、静态内部类可以直接访问外部类的静态成员，如果访问外部类的实例成员， 必须通过外部类的实例去方法
 *      3、在静态内部类中可以定义静态成员和实例成员
 *      4、测试类可以通过完成的类名直接访问静态内部类中的静态成员
 *
 *  (用的比较少)局部内部类：在方法中定义的内部类，其可见范围是当前方法，和局部变量是同一级别
 *  局部内部类的特点：
 *      1、局部内部类不能用修饰符修饰
 *      2、局部内部类智能在当前方法内使用
 *      3、局部内部类和实例内部类一样不能包含静态成员
 *      4、局部内部类和实例内部类一样，可以方法外部类的所有成员
 *      5、局部内部类访问的局部变量，必须使用final修饰符修饰（-------------重点---------------）
 *
 *  匿名内部类：是一个没有名称的局部内部类，适用值使用一次的类
 *  匿名内部类的特点：
 *      1、匿名内部类必须继承一个父类或者实现一个接口，但最多只能一个父类或实现一个接口
 */

class outclass{

    String name = "张三";

    static int age = 21;

    public void demo(){
        System.out.println("hello");
    }
    //实例内部类
    class innerclass{

        String name = "李四";

        int age = 18;
        public void test(){
            System.out.println(this.name);
            System.out.println(outclass.this.name);
        }
    }
    //静态内部类
    static class staticdemo{

        String name = "王五";
        static int age = 20;

        public void cases(){
            System.out.println(outclass.age);
            System.out.println(new outclass().name);
        }

    }
}
public class InterfaceInnerClass  {


    static String file = "外部静态成员";
    public static void main(String[] args){

//        创建outclass类的对象
//        outclass ot = new outclass();
//        outclass.innerclass innercalss =  ot.new innerclass();
        outclass.innerclass in = new outclass().new innerclass();
        System.out.println(in);
        in.test();

//        创建staticdemo类的对象
        outclass.staticdemo sd = new outclass.staticdemo();
        sd.cases();

        String content = "局部变量";



        //局部内部类
        class localinnerdemo{
            public void test(){
                System.out.println(file);
                System.out.println(content);
//                content = "修改局部变量";content被局部内部类调用，默认被final修饰
            }
        }
        new localinnerdemo().test();
    }


}
