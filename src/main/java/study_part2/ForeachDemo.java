package study_part2;

/**
 * Created by biz on 2018/6/20.
 */
public class ForeachDemo {

    public static void main(String[] args) {



        int[] demo = new int[]{10,20,30,40,50,60,70};

        //遍历数组内的元素

        for (int i = 0;i < demo.length;i++){

            System.out.println(demo[i]);
        }

        //利用foreach遍历数组内元素

        for (int temp:demo
             ) {
            System.out.println(temp);
        }
    }

}
