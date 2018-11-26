package study_part1;

import java.util.Scanner;

/**
 * Created by biz on 2018/6/10.
 */
public class IfDemo {

    public static void main(String []args){

        boolean IsMan = true;
        if (IsMan){
            System.out.println("去男厕所");
        }else {
            System.out.println("去女厕所");
        }


        int day = 9;

        if (day == 1){
            System.out.println("今天是星期一");
        }else if (day == 2){
            System.out.println("今天是星期二");
        }else if (day == 3){
            System.out.println("今天是星期三");
        }else if (day == 4){
            System.out.println("今天是星期四");
        }else if (day == 5){
            System.out.println("今天是星期五");
        }else if (day == 6){
            System.out.println("今天是星期六");
        }else if (day == 7){
            System.out.println("今天是周末");
        }else{
            System.out.println("输入错误");
        }

        int score = 12;

        if (score == 100){
            System.out.println("恭喜你得了满分");
        }else if (score >= 80 && score < 100){
            System.out.println("非常优秀");
        }else if (score >= 60 && score < 90){
            System.out.println("优秀");
        }else{
            System.out.println("及格");
        }

    }
}
