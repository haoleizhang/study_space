package study_part2;

/**
 * Created by biz on 2018/6/21.
 *
 * 把A数组内第5-7个元素拷贝到B数组内3-5位置
 */


public class ArrayCopyDemo {


    public static void main(String[] args){

        int[] src = new int[]{10,20,30,40,50,60,70,80,90,100};

        printArray(src);

        int[] des = new int[10];

        printArray(des);

        arrCopy(src,des,3,5,5);


        System.out.println("-----------操作后----------------");


        printArray(src);

        printArray(des);

        System.out.println("--------------调用已有方法-----------------");

        System.arraycopy(src,3,des,5,3);

        printArray(src);

        printArray(des);

    }


    //遍历数组内元素
    static void printArray(int[] arr){

        for (int demo:arr
             ) {
            System.out.print(demo+ " ");
        }
        System.out.println();
    }

    /**
     *
     * begin:源数组
     * end:目标数组
     * start:源数组内起始位置
     * over:目标数组内起始位置
     * length:需要拷贝的元素个数
     */
    static void arrCopy(int[] begin,int[] end,int start,int over,int length){



//        end[over] = begin[start];
//        over++;
//        start++;
//
//        end[over] = begin[start];
//        over++;
//        start++;
//
//        end[over] = begin[start];
//        over++;
//        start++;



        for (int i=0;i<length;i++){
            end[over] = begin[start];
            over++;
            start++;

        }
    }

}
