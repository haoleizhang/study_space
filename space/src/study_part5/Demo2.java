package study_part5;/**
 * Created by biz on 2018/7/22.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: 类描述$
 * @Param: 类参数$
 * @return: 返回$
 * @Author: biz
 * @Date: 日期$
 */
public class Demo2 {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("被回收了");
    }

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

//        String out = sn.nextLine();

//        System.out.println(out);


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] dest = new int[10];

        System.out.println(Arrays.toString(dest));
        //拷贝数组功能
        System.arraycopy(arr, 4, dest, 5, 3);

        System.out.println(Arrays.toString(dest));

        //输出当前时间戳
        System.out.println(System.currentTimeMillis());

        //退出JVM


//        System.exit(0);
//        退出JVM之后代码不会被执行
        System.out.println("测试代码");

        new Demo2();
        new Demo2();
        new Demo2();


        //强行垃圾回收
//        System.gc();

    }
}
