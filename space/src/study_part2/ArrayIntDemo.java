package study_part2;

/**
 * Created by biz on 2018/6/17.
 */
public class ArrayIntDemo {



    //求数组内最大值
    static int getMax(int[] nums){

        int maxlength = nums[0];

        for (int length = 0;length < nums.length;length++){

            if (nums[length] > maxlength){
                maxlength = nums[length];
            }
        }


        return maxlength;
    }

    //求数组内最大值
    static int Min(int[] nums){

        int minlength = nums[0];

        for (int length = 0;length < nums.length;length++){

            if (nums[length] < minlength){
                minlength = nums[length];
            }
        }


        return minlength;
    }


    public static void main(String[] args) {



          //静态初始化值
        int[] nums1 = new int[] {-43,1,3,5,7,9};
//        int number[] ={2,4,6};
//        System.out.println(nums.length);
//        System.out.println(number.length);
//
//
//        //动态初始化值
//
//        int[] a = new int[10];
//
//        System.out.println(a.length);
//
//        a = new int[100];
//
//        System.out.println(a.length);
//
//        System.out.println(a[0]);
//
//        a[0] = 1000;
//
//        System.out.println(a[0]);

        nums1[4] = 100;

        int Max = ArrayIntDemo.getMax(nums1);
        System.out.println(Max);

        int Min = ArrayIntDemo.Min(nums1);
        System.out.println(Min);

    }
}
