package study_part1;

/**
 * Created by biz on 2018/6/13.
 * Continue 跳过当前循环进入下一次循环
 */
public class ContinueDemo {
    public static void main(String[] args) {

        //输出10以内的正整数，除了4
        for (int i = 1;i <= 10;i++){

            if (i == 4){
                continue;
            }
            System.out.println(i);
        }


        //输出100-200之间不能被3整除的数

        for (int j = 1;j <=200;j++){
            if (j % 3 ==0){
                continue;
            }
            System.out.println(j);
        }
    }
}
