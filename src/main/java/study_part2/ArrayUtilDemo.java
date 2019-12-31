package study_part2;



import java.util.Arrays;

/**
 * Created by biz on 2018/6/24.
 */
public class ArrayUtilDemo {

    public static void main(String[] args) {

        int[] demo = new int[]{10,4,5,1,64,7,2,9,8};


        Arrays.sort(demo);

        for (int i = 0;i<demo.length;i++){
            System.out.println(demo[i]);
        }
    }
}
