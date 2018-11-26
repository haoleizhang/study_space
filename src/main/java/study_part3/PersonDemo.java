package study_part3;

/**
 * Created by biz on 2018/6/30.
 */
class Person {

    private String name;

    private int age;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    Person(){
        System.out.println(this);
    }
}


public class PersonDemo{

    public static void main(String[] args){

        Person p = new Person();

        p.setName("张三");
        p.setAge(18);

        String name = p.getName();

        int age = p.getAge();

        System.out.println(name + ", " + age);
    }
}