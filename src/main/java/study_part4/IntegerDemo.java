package study_part4;

/**
 * Created by biz on 2018/7/10.
 */
public class IntegerDemo {


    public static void main(String[] args){

        //装箱：把一个基本数据类型的值转换为它的包装类对象
        Integer a1 = new Integer(18);

        Integer a2 = Integer.valueOf(19);

        //自动装箱 底层实现逻辑仍是用的手动装箱的方法
        Integer a4 = 20;


        //拆箱：把一个包装类对象转换为基本数据类型的变量
        int a3 = a1.intValue();
        double d1 = a1.doubleValue();

        //自动拆箱  底层实现逻辑仍是用的手动拆箱的方法
        int a5 = a4;

//        System.out.println(a1);
//
//        System.out.println(a2);
//
//        System.out.println(a3);
//
//        System.out.println(a4);
//
//        System.out.println(a5);
//
//        //Integer内常量
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        System.out.println(d1);

        System.out.println("---------------------------------");

        //基本数据类型、包装类、String类型之间的转换

        //基本数据类型转换为String
        //String s1 = 17 + ""; //最简单的方法
        String s1 = String.valueOf(17);
        System.out.println(s1.getClass() + ": " + s1);

        //基本数据类型转换为包装类
        Integer s2 = Integer.valueOf(18);
        System.out.println(s2.getClass() + ": " + s2);

        //包装类转换为基本数据类型
        Integer s3 = 19;
        int s4 = s3.intValue();
        System.out.println(s4);

        //包装类转为为String类型
//        String s5 = String.valueOf(s3);
        String s5 = s3.toString();
        System.out.println(s5.getClass() + ": " + s5);

        //String转换为基本数据类型
//        String str = "asd123";//此处会报错，因为字符串里面含有字母
        String str = "1234";
        int s6 = Integer.parseInt(str);
        System.out.println(s6);

        //String与包装类之间的转换
//        Integer i = Integer.valueOf(str);
        Integer i = new Integer("2345");
//        Integer i = new Integer("1234a");//此处会报错，因为字符串里面含有字母
        System.out.println(i);

        //String类型转换为boolean的包装类
        Boolean bl1 = Boolean.valueOf("true");
        Boolean bl2 = Boolean.valueOf("false");
        Boolean bl3 = Boolean.valueOf("sbtrue");//除了true其他的都任务是false

        System.out.println(bl1);
        System.out.println(bl2);
        System.out.println(bl3);


        System.out.println(Integer.toBinaryString(999));
        System.out.println(Integer.toOctalString(999));
        System.out.println(Integer.toHexString(999));

    }
}
