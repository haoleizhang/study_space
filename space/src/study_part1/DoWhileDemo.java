package study_part1;

/**
 * Created by biz on 2018/6/11.
 */
public class DoWhileDemo {




    public static void main(String[] args) {

        int number = 0;
        //输出500次hello
        do {
            number ++;
            System.out.println("hello"+number);
        }while (number<500);



        //计算100以内正整数的和
        int count = 0;
        int i = 0;
        do {
            i++;
            count += i;
        }while (i < 100);

        System.out.println(count);
    }

}
