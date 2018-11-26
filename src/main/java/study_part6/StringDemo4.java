package study_part6;

/**
 * Created by biz on 2018/8/6.
 *
 * StringBuilder速度最快，但是不安全
 * StringBuffer 是用synchronized修饰过的，表示同步，在多线程并发的时候开业保证线程安全，建议使用StringBuffer
 *
 *
 * 使用StringBuffer无参数构造器时，底层实际上是创建了一个长度为16的char数组
 * 如果超过16位会自动扩容性能低，建议创建对象时直接跟长度 列子：StringBuffer sb = new StringBuffer(22);
 */


public class StringDemo4 {

    public static void main(String[] args){

//        testString();
//        testStringBuffer();
//        testStringBuilder();

        StringBuffer str = new StringBuffer("ABCDEFG");

        str.append('H');
        System.out.println(str);

        str.deleteCharAt(str.length()-1);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

    }

    private static void testStringBuilder() {

        StringBuilder str = new StringBuilder();

        long start = System.currentTimeMillis();

        for (int i = 0;i<30000;i++){
            str.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testStringBuffer() {

        StringBuffer str = new StringBuffer();
        long start = System.currentTimeMillis();

        for (int i = 0;i<30000;i++){
            str.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testString() {
        String str = "";
        long start = System.currentTimeMillis();

        for (int i = 0;i<30000;i++){
            str += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
