package study_part1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by biz on 2017/8/2.
 */
public class stochastic {

    /**
     * 生成大小写字母和数字的随机字符串
     * @param length
     * @return
     */
    public  static String randomstring (int length){

        String demo = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();

        StringBuffer sb = new StringBuffer();
        for (int i=0;i<length;i++){
            int number = random.nextInt(demo.length());
            sb.append(demo.charAt(number));
        }
        return sb.toString();

    }

    public static String randomdate (){

        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();

        String start = simpleDateFormat.format(date);

        Random random = new Random();

        int end = random.nextInt(10000);
        System.out.println(end);
        StringBuffer sb = new StringBuffer();
        sb.append(start).append(end);

        return sb.toString();
    }

    /**
     * calendar类
     * @param args
     */

    public void calendartest(){

        Calendar cd = Calendar.getInstance();
        Date dt =cd.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String st = sdf.format(dt).toString();
        cd.add(Calendar.DATE,14);
        Date nextdt =cd.getTime();
        String nextst = sdf.format(nextdt).toString();
        System.out.println(st);
        System.out.println(nextst);

    }

    public static void main(String[] args) {

        stochastic stc = new stochastic();
//        String ca = stc.randomstring(6);
//        System.out.println(ca);
//
//        String cs = stc.randomdate();
//        System.out.println(cs);
        stc.calendartest();

    }
}
