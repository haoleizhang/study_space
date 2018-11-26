package study_part6;

/**
 * Created by biz on 2018/8/19.
 */


public class ExceptionDemo1 {

    public static void main(String[] args){


        System.out.println("begin");


        try{

            System.out.println(10 / 0);

            System.out.println("计算中");

        }catch(Exception e){

            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("出异常啦！！！");
        }


        System.out.println("end");

    }
}
