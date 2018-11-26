package study_part3;

/**
 * Created by biz on 2018/7/8.
 */


    class SuperClass1{

        public String name = "Super.name";

        public void demo(){
            System.out.println("Super.demo");
        }
    }

    class SubClass1 extends SuperClass1{

        public String name = "Sub.name";

        //方法的隐藏，不是覆盖
        public void demo(){
            System.out.println("Sub.demo");
        }
    }


public class SuperDemo1 {
    public static void main(String[] args){

        SuperClass1 sc = new SubClass1();
        sc.demo();
        //隐藏只针对方法，不针对字段
        System.out.println(sc.name);
    }
}
