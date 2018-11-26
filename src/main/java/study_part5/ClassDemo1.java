package study_part5;/**
 * Created by biz on 2018/7/23.
 */

import java.math.BigDecimal;

/**
 * @Description: 常用类$
 * @Param: $
 * @return: $
 * @Author: biz
 * @Date: $
 */
public class ClassDemo1 {


    public static void main(String[] args) {

        double db = Math.random() * 1000;

        int idb = (int) db;

        System.out.println(idb);

        System.out.println("----------------");

        System.out.println("0.2" + "+ 0.3" + "=" + (0.09+0.01));

        //Bigdecimal的构造器中，double参数的构造器计算时精度不准确
        BigDecimal bd1 = new BigDecimal(1.23);
        BigDecimal bd2 = new BigDecimal(2.456);
        System.out.println(bd1.add(bd2));

        //应该使用String类型的构造器
        bd1 = new BigDecimal("1.23");
        bd2 = new BigDecimal("2.456");
        System.out.println(bd1.add(bd2));

        //底层实际调用的时toString()方法
        System.out.println(BigDecimal.valueOf(3.14));

        System.out.println(new BigDecimal(Double.toString(db)));
    }
}
