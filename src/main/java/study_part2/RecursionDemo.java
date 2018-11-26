package study_part2;

/**
 * Created by biz on 2018/6/15.
 * F(0) = 0;F(1) = 1; F(n) = F(n-1) + F(n-2)
 * 递归：方法自己调用自己
 *
 */
public class RecursionDemo {

    public static void main(String []args){
        System.out.println(RecursionDemo.getF(6));
    }

    static int getF(int a){

        if (a == 0){
            return 0;
        }
        if (a == 1){
            return 1;
        }else {
             return getF(a -1 )+getF(a - 2);
        }

    }


}
