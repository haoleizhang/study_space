package study_part2;

/**
 * Created by biz on 2018/6/21.
 *
 * 利用冒泡法对数组进行排序
 *
 */
public class ArraySortDemo {

    public static void main(String[] args){

        int[] demo = new int[]{10,4,5,1,64,7,2,9,8};


        printArray(demo);

        //bubbleSort(demo);

        selectSort(demo);

        printArray(demo);

//        sort(demo);

//        printArray(demo);



    }
    //冒泡算法-升序
    static void bubbleSort(int[] arr){

//        //第一次比较
//        for (int i =0;i< arr.length-1;i++){
//            if (arr[i] < arr[i+1]){
//                swap(arr,i,i+1);
//            }
//        }
//        //第二次比较
//        for (int i =0;i< arr.length-2;i++){
//            if (arr[i] < arr[i+1]){
//                swap(arr,i,i+1);
//            }
//        }
//        //第三次比较
//        for (int i =0;i< arr.length-3;i++){
//            if (arr[i] < arr[i+1]){
//                swap(arr,i,i+1);
//            }
//        }
//        //.......省略......原始方法

        for (int time =1;time < arr.length;time++){
            for (int i =0;i< arr.length-time;i++){
                if (arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }

        }





        //升序排序
//        for (int time =0;time < arr.length-1;time++){
//            for (int i =0;i< arr.length-1;i++){
//                if (arr[i] > arr[i+1]){
//                    swap(arr,i,i+1);
//                }
//            }
//        }


    }

    static void sort(int[] arr){

        //降序排序
        for (int time =0;time < arr.length;time++){
            for (int i =0;i<= arr.length-1;i++){
                if (arr[i] < arr[i+1]){
                    swap(arr,i,i+1);
                }
            }

        }

    }
    //选择排序
    static void selectSort(int[] arr){

//        for (int i = 0;i< arr.length-1;i++){
//
//            if (arr[0] > arr[i+1]){
//                swap(arr,0,i+1);
//            }
//        }
//
//        for (int i = 1;i< arr.length;i++){
//
//            if (arr[1] > arr[i+1]){
//                swap(arr,0,i+1);
//            }
//        }
//
//        for (int i = 2;i< arr.length;i++){
//
//            if (arr[2] > arr[i+1]){
//                swap(arr,0,i+1);
//            }
//        }

//        for (int time =1;time<arr.length;time++){
//            for (int i = time-1;i< arr.length-1;i++){
//
//                if (arr[time-1] > arr[i+1]){
//                    swap(arr,time-1,i+1);
//                }
//            }
//        }

        //选择排序法-正版
        for (int time =0;time<arr.length-1;time++){

            int minindex = time;
            for (int i = time;i<= arr.length-1;i++){

                if (arr[i] < arr[minindex]){
                        minindex = i;
                }

            }
            swap(arr,time,minindex);
        }



    }


    //封装调换数组内元素方法

    static void swap(int[]arr,int one, int two){

        int tem = arr[one];
        arr[one] = arr[two];
        arr[two] = tem;


    }
    //打印数据
    static void printArray(int[] arr){

        System.out.print("[ ");
        for (int sys:arr
             ) {
            System.out.print(sys + " ");

        }
        System.out.print("]");
        System.out.println();
    }


}
