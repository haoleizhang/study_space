package study_part2;

/**
 * Created by biz on 2018/6/19.
 * 多维数组
 *
 *
 * 杨辉三角
 */
public class ArrayInArray {

    public static void main(String[] args){

        //静态初始化
        int[][] demo = new int[][]{
                {1,2,3},
                {4,5},
                {6}
        };

//        动态初始化,创建1个长度为3的二维数组，元素是由一个长度为5的一位数组组成
//        int[][] demo = new int[3][5];

        printArray(demo);

    }


    static void printArray(int[][] demo){

        for (int i = 0;i < demo.length;i++){
            for (int j =0;j<demo[i].length;j++){
                System.out.println(demo[i][j]);
            }
        }
    }
}
