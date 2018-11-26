package study_part2;

/**
 * Created by biz on 2018/6/20.
 * 方法的可变参数
 */
public class VarArrayDemo {


    public static void main(String[] args){


        int[] demo = new int[]{10,20,30,40,50,60,70};

        System.out.println(getSum(demo));


        System.out.println(getSum(10,20,30));

        //计算数组内元素的和
    }


//    static int getSum(int[] arr){
//
//        int sum = 0;
//        for (int i = 0;i < arr.length;i++){
//            sum += arr[i];
//        }
//
//        return sum;
//    }

    /*
    可变参数必须作为方法的最后一个参数
    可变参数必须只能有一个
    可变参数其底层就是一个数组
     */


    static int getSum(int ... arr){
        int sum = 0;

        for (int demo:arr
             ) {
            sum += demo;
        }

        return sum;
    }

}
