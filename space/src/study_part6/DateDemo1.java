package study_part6;

import java.util.Date;

/**
 * Created by biz on 2018/8/7.
 */


public class DateDemo1 {

    public static void main(String[] args){

        Date date = new Date();
        //可以之间传long类型的构造方法
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(date1);
        //获取当前时间的时间戳 返回long类型
        System.out.println(date1.getTime());
        System.out.println(date.toLocaleString());

    }
}
