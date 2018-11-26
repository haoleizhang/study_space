package study_part1;

/**
 * Created by biz on 2018/6/10.
 */
public class WhileDemo {

    public static void main(String[] args) {

        int i = 0;
        int number = 0;
        while (i < 100){
            i++;
            number = number + i;
        }

        System.out.println(number);

    }
}
