package study_part1;

/**
 * Created by biz on 2018/6/11.
 */
public class LoopInLoopDemo {

    public static void main(String[] args) {


        for (int i = 1; i <= 4;i++){
            System.out.println("第" + i + "次");
            for (int j = 1;j <= 10;j++){
                System.out.println("hello" + j);
            }

        }
    }
}
