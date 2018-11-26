package study_part6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by biz on 2018/8/12.
 */


public class CalendarDemo {

    public static void main(String[] args){


        Calendar cd = Calendar.getInstance();

        //Calendar cd1 = new GregorianCalendar();

        System.out.println("年:"+ cd.get(Calendar.YEAR));
//        System.out.println("月:"+ (cd.get(Calendar.MONTH)+1));
        System.out.println("日:"+ cd.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:"+ cd.get(Calendar.HOUR));
        System.out.println("分:"+ cd.get(Calendar.MINUTE));
        System.out.println("秒:"+ cd.get(Calendar.SECOND));

        Date dt = cd.getTime();

        System.out.println(dt);

        cd.add(Calendar.MONTH,1);

        System.out.println(cd.getTime().toLocaleString());

    }
}
