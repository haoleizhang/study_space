package study_part1;

/**
 * Created by biz on 2018/6/14.
 * 结束所在的方法
 */
public class ReturnDemo {
    public static void main(String[] args) {


        for (int i = 1;i<=10;i++){
            System.out.println(i);
            if (i ==4){
                break;
            }
        }
        System.out.println("ending======");

        System.out.println("----------------------------");


        for (int i = 1;i<=10;i++){
            System.out.println(i);
            if (i  ==4){
                return;
            }
        }
        System.out.println("ending======");//这句话因为return不会执行

    }
}
