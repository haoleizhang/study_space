package study_part6;

import java.util.Arrays;

/**
 * Created by biz on 2018/8/5.
 */


public class StringDemo1 {



    public static void main(String[] args){


//        buildString();
//        getStringDetail();
//        StringEquels();
        StringChange();
    }

    private static void StringChange() {

        String str1 = "ANSsaASF";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
    }

    /**
     * 字符串的比较
     */
    private static void StringEquels() {

        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.contentEquals(str2));
        System.out.println(str1.equalsIgnoreCase("abc"));//忽略大小写的比较
    }

    /**
     * 获取字符串信息
     */
    private static void getStringDetail() {

        String str1 = new String("ABCDEF");
        System.out.println(str1.length());//6
        System.out.println(str1.charAt(2));
        System.out.println("ASBABSASDBABDASNBSADBN".indexOf("AB"));
        System.out.println("ABSKFMSFBSF".lastIndexOf("F"));


    }

    /**
     * String与其他类型的变量之间的转换
     */
    private static void buildString() {
        //char和String之间的相互转换
        String str1 = new String("ABCDE");
        char[] ca = str1.toCharArray();
        System.out.println(ca);
        System.out.println(new String(ca));
        //byte和String之间的相互转换
        System.out.println(Arrays.toString(str1.getBytes()));
        System.out.println(new String(str1.getBytes()));
    }


}
