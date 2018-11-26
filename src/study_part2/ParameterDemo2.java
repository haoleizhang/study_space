package study_part2;

/**
 * Created by biz on 2018/6/19.
 *
 * 帮助理解堆和栈的概念
 *
 * 引用数据类型的值传递机制，引用数据类型主要传递堆内存中值
 *
 */
public class ParameterDemo2 {

    public static void main(String[] args){

        int[] demo = new int[]{10,40};
        printArray(demo);//输出数组内元素
        swap(demo);//交换数组内第一个值与最后一个值
        printArray(demo);
    }

    static void swap(int[] demo){
        int tem = demo[0];
        demo[0] = demo[demo.length-1];
        demo[demo.length-1] = tem;

    }


    static void printArray(int[] demo){

        for (int i =0;i<demo.length;i++){
            System.out.print(demo[i]);
        }
        System.out.println();

    }




}
