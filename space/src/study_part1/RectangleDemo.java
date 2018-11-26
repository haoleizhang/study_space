package study_part1;

/**
 * Created by biz on 2018/6/12.
 */
public class RectangleDemo {
    public static void main(String[] args) {

        //输出矩形

        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------");
        //输出三角形


        for (int m = 0;m < 5;m++){
            for (int n = 0;n <= m;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
