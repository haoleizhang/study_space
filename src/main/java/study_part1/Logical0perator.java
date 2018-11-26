package study_part1;

/**
 * Created by biz on 2018/6/7.
 * 逻辑运算符
 */
public class Logical0perator {

    public static void main(String[] args) {

        /**
         * &和&&的区别是：
         * &不管第一个的判断的结果是什么都会及运算第二个判断
         * &&与只要第一个判断满足条件就不会去运行第二个判断
         */
//        System.out.println(false & 5 / 0 == 1);//会报错

        System.out.println(false && 5 / 0 == 1);

        //&
        System.out.println(true & false);//false

        System.out.println(true & true);//true

        System.out.println(false & true);//false

        System.out.println(false & false);//false

        System.out.println("------------分割线----------------");
        // |
        System.out.println(true | false);//true

        System.out.println(true | true);//true

        System.out.println(false | true);//true

        System.out.println(false | false);//fasle

        System.out.println("------------分割线----------------");

        //&&
        System.out.println(true && false);//false

        System.out.println(true && true);//true

        System.out.println(false && true);//false

        System.out.println(false && false);//false

        System.out.println("------------分割线----------------");
        // ||
        System.out.println(true || false);//true

        System.out.println(true || true);//true

        System.out.println(false || true);//true

        System.out.println(false || false);//fasle

        System.out.println("------------分割线----------------");

        // ^ 异或  相同为false、不同为true

        System.out.println(true ^ false);//true

        System.out.println(true ^ true);//false

        System.out.println(false ^ true);//true

        System.out.println(false ^ false);//fasle
    }
}
