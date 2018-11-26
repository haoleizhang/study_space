package study_part2;

/**
 * Created by biz on 2018/6/15.
 * 计算2个数的和
 * 方法的重载：主要解决同一个功能因为参数不同而造成的方法名称不同
 * 同一个类中，方法名称相同，参数列表不同（参数列表：参数类型、参数个数、参数顺序）
 */
public class MethodDemo2 {

    //求2个整数的和
    static int getSum(int a ,int b){

        return a + b;
    }

    //求2个小数的和
    static double getSum(double a,double b){
        return a + b;
    }


    public static void main(String[] args) {

        int sum = MethodDemo2.getSum(8,5);
        double sum1 =MethodDemo2.getSum(3.2,14.5);

        System.out.println(sum);

        System.out.println(sum1);
    }
}
