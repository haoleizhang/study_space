package study_part3;

/**
 * Created by biz on 2018/7/3.
 */

class SuperClass{

    private String name = "初始值";
    private int age;
    //父类构造器
    SuperClass(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("父类的构造器");
    }

    SuperClass(){}
    //test方法
    public static void test(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SubClass extends SuperClass{

    private String add;

    private String name = "子类中name";

    //子类构造器
    SubClass(String name,int age,String add){
        super(name, age);
        this.add = add;
        System.out.println("子类的构造器");
    }
    public String getAdd(){
        return add;
    }
    //static修饰过的方法，不算方法覆盖，是隐藏
    public static void test(){

    }

    public void fly(){
        boolean name = false;

        System.out.println(name);//隐藏了本类中的name

        System.out.println(this.name);//输出本类中name

        System.out.println(super.getName());//输出父类中的name
    }
}

public class SuperDemo {

    public static void main(String[] agrs){

        SubClass sc = new SubClass("张三",18,"上海");

        System.out.println(sc.getAdd() + sc.getName() + sc.getAge());

        sc.fly();


        String str = "ABC";

        System.out.println(str.hashCode());

        System.out.println(str.equals(str));
    }
}
