package study_part2;

/**
 * Created by biz on 2018/6/18.
 * 安装格式打印数组内元素
 */
public class ArrayDemo2 {

    public static String[] demo =  new String[]{"A","B","C","D","E"};

    //输出数组内元素
    static String PrintArray(String[] array){
        if (array == null){
            return "不能输入null";
        }

        String ret = "[";

        for (int length = 0;length < array.length;length++){
            ret = ret + array[length];

            if (length != array.length-1){
                ret = ret + ", ";
            }
        }
        ret = ret + "]";

        return ret;
    }


    //倒序输出数组内元素
    static String ReversePrintArray(String[] array){
        if (array == null){
            return "不能输入null";
        }

        String ret = "[";

        for (int length =array.length;length > 0;length--){
            ret = ret + array[length-1];

            if (length != 1){
                ret = ret + ", ";
            }
        }
        ret = ret + "]";

        return ret;
    }



    public static void main(String[] args) {
        //打印数组的时候实际上是打印数据的hashCode
        System.out.println(demo);

        System.out.println(demo[0]);

        String res = ArrayDemo2.PrintArray(null);
        System.out.println(res);

        String res1 = ArrayDemo2.ReversePrintArray(demo);
        System.out.println(res1);
    }
}
