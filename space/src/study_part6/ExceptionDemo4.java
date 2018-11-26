package study_part6;

/**
 * Created by biz on 2018/8/22.
 *
 * throw是返回一个异常对象，类型return,结束当前方法
 * throws是把异常抛出，调用者必须处理，main方法也用throws的话，会吧异常抛给JVM,JVM处理异常的方法是输出异常的栈信息
 *
 */


public class ExceptionDemo4 {

    public static void main(String[] args){

        System.out.println("ABCDE".charAt(-1));

//        try {
//            System.out.println(getSum(10,0));
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

        try {
            System.out.println(getSum(10,0));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static int getSum(int num1,int num2) throws Exception{

        if (num2 == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        System.out.println("begin");

        int ret = num1 / num2;

        System.out.println("end");
        return ret;

    }
}
