package study_part1;

/**
 * Created by biz on 2018/6/13.
 * break终止循环
 */
public class BreakDemo {

    public static void main(String[] args) {
/*
        for (int i =0;i <=10;i++){
            System.out.println(i);
            if (i == 5){
                break;
            }
        }*/

        //求出100以内前5个3的倍数的数字
        int number = 0;

        for (int i = 1; i<=100;i++){
            if (i % 3 == 0){
                System.out.println(i);
                number++;
            }
            if (number == 5){
                break;
            }

        }
//        System.out.println(number);


    }
}
