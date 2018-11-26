package study_part2;

/**
 * Created by biz on 2018/6/23.
 */
public class ArraySerachDemo {


    public static void main(String[] args){

        int[] demo = new int[]{1,2,3,4,5,6,7,8,9,10};

        printArray(demo);

        int result = arraySerach(demo,10);

        System.out.println(result);

//        System.out.println((15) >> 1);



    }


    //二分法查找元素
    static int arraySerach(int[] arr,int key){

        int start = 0;
        int end = arr.length -1;

//        while (start <= end){
//            int min = (start + end) >> 1;
//            int num = arr[min];
//
//            if (num > key){
//                end = min -1 ;
//            }else if (num < key){
//                start = min +1;
//            }else {
//                return min;
//            }
//        }


        while (start <= end){
            int min = (end + start)/2;

            if (key > arr[min]){
                start = min + 1;
            }else if (key < arr[min]){
                end = min - 1;
            }else{
                return min;
            }
        }

        return -1; //异常情况
    }

    static void printArray(int[] arr){

        for (int sys:arr
             ) {
            System.out.print(sys + " ");
        }
        System.out.println();
    }



}
