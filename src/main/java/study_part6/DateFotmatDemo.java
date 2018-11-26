package study_part6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by biz on 2018/8/12.
 */


public class DateFotmatDemo {


    public static void main(String[] args) throws ParseException {


        Date dt = new Date();

        System.out.println(dt);

        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);


        String st = df.format(dt);

        System.out.println(st);

        Date date = df.parse(st);

        System.out.println(date);

        String pattern = "yyyy-MM-dd HH:mm:ss E";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");

        System.out.println(sdf.format(date));
    }

}
