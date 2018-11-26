package study_part1;

/**
 * Created by biz on 2018/6/9.
 */
public class BitOperatorDemo {

    public static void main(String[] args){

        System.out.println(3 & 5);
        System.out.println(3 | 5);
        System.out.println(3 ^ 5);
        System.out.println(~3);

        System.out.println(2 << 3);
        System.out.println(16 >> 3);
        System.out.println(-16 >> 3 );



        int a = 10;
        int b = 15;

        a = b - a;

        b = b - a;

        a = a + b;

        System.out.println(a);
        System.out.println(b );
    }
}
