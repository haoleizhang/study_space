package study_part3;

/**
 * Created by biz on 2018/7/2.
 *
 * 引出继承关系
 *
 * super关键字
 *
 * static和super、this不能共存，因为static属于类，而super、this是属于对象；有类不一定有对象
 */

class person {
    String name;
    int age;

    person(){
        System.out.println("父类构造器");
    }

    void sleep() {
        System.out.println("父类中的方法");
    }
}

class teacher extends person {
    String level;

    @Override
    void sleep() {
        System.out.println("子类中的方法");
    }

    teacher(){
        super();//创建子类对象时，先调用父类的构造器；必须现有父类对象然后才有子类对象；super()可省略
        System.out.println("子类构造器");
    }

}

class student extends person {

    String id;
}

public class ExtendsDemo {
    public static void main(String[] agrs) {
        teacher tc = new teacher();
        tc.sleep();
        System.out.println(tc.name);

    }
}
