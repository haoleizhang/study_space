package study_part6;

import com.sun.deploy.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by biz on 2018/8/13.
 */


public class DateUtilDemo {


    private static final String DatePattern = "yyyy-MM-dd HH:mm:ss E";

    //date类型转为字符串
    public static String Date2String(Date date,String pattern){

        SimpleDateFormat sdf = new SimpleDateFormat();

//        pattern = "yyyy-MM-dd HH:mm:ss E";

        if(pattern!=null && !"".equals(pattern.trim())){
            sdf.applyPattern(pattern);
        }

        String result = sdf.format(date);

        return result;
    }

    public static String Date2String(Date date){
        return Date2String(date,null);
    }


    //String类型转为Date
    public static Date String2Date(String string) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.parse(string);
    }

    public static void main(String[] args) throws ParseException {

        System.out.println(Date2String(new Date(),DatePattern));


        System.out.println(Date2String(new Date(),"yyyy-MM-dd"));
        System.out.println(Date2String(new Date()));

        String str = Date2String(new Date());
        System.out.println(String2Date(str));
    }




}
