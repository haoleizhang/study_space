package study_part3;

/**
 * Created by biz on 2018/6/26.
 * 关于构造器的重载
 */

class ConstrtorPerson{

    String name;

    ConstrtorPerson(String n){

        System.out.println("重载的构造方法");
        name = n;
    }

    ConstrtorPerson(){

        System.out.println("原始的构造器");
    }

}

public class ConstrutorDemo {


    public static void main(String[] args){

        //创建对象，其实是在调用构造器
        new ConstrtorPerson();

        //调用重载的构造器
        ConstrtorPerson p = new ConstrtorPerson("will");

        System.out.println(p.name);

    }

}
