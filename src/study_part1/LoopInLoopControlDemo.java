package study_part1;

/**
 * Created by biz on 2018/6/14.
 * 控制外层循环
 */
public class LoopInLoopControlDemo {
    public static void main(String[] args) {

        outer:for (int i = 1; i <= 9;i++){
            for (int j = 1;j <= i; j++){

                if (i == 5){
//                    return;
                    break outer;//类似Return
                }
                System.out.print(j + " * " + i +" = " +(i*j) + '\t');

            }
            System.out.println();
        }
    }
}
