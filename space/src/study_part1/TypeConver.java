package study_part1;

/**
 * Created by biz on 2018/6/5.
 */
//算术运算符
public class TypeConver {
    public static void main(String[] args) {



    System.out.println(10 + 1);
    System.out.println(10 - 2);
    System.out.println(10 * 3);
    System.out.println(10 / 4);//取商
    System.out.println(10 % 3);//取余


    System.out.println("-----------完美的分割线-------");

    System.out.println('A' + 'B');

    System.out.println("AAA" + "BBB");

    System.out.println(99967 / 1000 * 1000);

//    System.out.println(10 / 0);

    System.out.println(10.1 / 0); //Infinity无穷大

    System.out.println(0.0 / 0.0);//NaN not is number

    System.out.println(0.0 / 0.0 == 0.0 / 0.0); //false  NaN自己都不等于登记

    System.out.println("END");


    int A = 5;

    A++;

    System.out.println("A" + A);

    int B = 5;

    ++B;
    System.out.println("B" + B);

        int a =A++;// ;
        int b =++B;//a = a + 1
    System.out.println("a" + a);
        System.out.println("A" + A);
    System.out.println("b" + b);
        System.out.println("B" + B);






























    }
}
