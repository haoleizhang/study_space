package study_part9;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @program: Maventest
 * @description: 编码和解码
 * @author: 作者名称
 * @date: 2020-01-07 13:05
 **/
public class EncodingDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String old = "张三";
        byte[] byteps = old.getBytes("GBK");
        System.out.println(Arrays.toString(byteps));


        //解码
        String s = new String(byteps,"ISO-8859-1");
        System.out.println(s);

        byte[] bytes = s.getBytes("ISO-8859-1");
        System.out.println(Arrays.toString(bytes));
        String news = new String(bytes,"GBK");
        System.out.println(news);
    }
}
