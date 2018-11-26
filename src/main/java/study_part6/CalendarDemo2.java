package study_part6;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by biz on 2018/8/14.
 * 计算时间
 */


public class CalendarDemo2 {

    public static void main(String[] args){


        Date date = new Date();

        Calendar cd = Calendar.getInstance();

        cd.add(Calendar.DAY_OF_MONTH,1);//日期加1
        cd.set(Calendar.HOUR_OF_DAY,0);//小时置为0
        cd.set(Calendar.MINUTE,0);//分钟置为0
        cd.set(Calendar.SECOND,0);//秒数置为0


        date = cd.getTime();
        System.out.println(date.toLocaleString());

        Date endtime = cd.getTime();

        cd.add(Calendar.DAY_OF_MONTH,-7);
        Date starttime = cd.getTime();


        System.out.println(starttime.toLocaleString());
        System.out.println(endtime.toLocaleString());

    }
}
