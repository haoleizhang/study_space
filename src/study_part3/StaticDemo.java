package study_part3;

/**
 * Created by biz on 2018/6/26.
 * static关键字
 * 使用static修饰的字符只能用类来调用，不能用对象调用
 * （用对象调用也可以，但是编译器还是认为是用类在调用）
 * static修饰的变量或者方法是属于类的不属于对象
 */

class StaticPerson{

    //totalnum类型是属于类的不属于对象
    static int totalnum = 5;

    String name;

    int age;

    void die(){
        System.out.println("调用去世的方法``````````");
        totalnum --;
    }

    static void destory(){
        System.out.println("调用毁灭的方法");
        totalnum = 0;
    }

    //重载构造器
    StaticPerson(String n,int a){
        System.out.println("重载的构造器");
        totalnum ++;
    }


}

public class StaticDemo {

    public static void main(String[] args){


        System.out.println(StaticPerson.totalnum);
        StaticPerson s1 = new StaticPerson("xiaoming",19);
        StaticPerson s2 = new StaticPerson("xiaohong",20);
        System.out.println(StaticPerson.totalnum);

        s1.die();
        System.out.println(s1.totalnum);//编译器编译的时候实际上是StaticPerson.totalnum

        StaticPerson.destory();

        System.out.println(StaticPerson.totalnum);
    }


}
