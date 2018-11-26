package study_part6;

import java.io.IOException;

/**
 * Created by biz on 2018/8/20.
 */


public class ExceptionDemo2 {


    /**
     * 描述方法的功能
     * @param name
     * @return
     * @throws IOException
     */
    public static int tes(String name) throws IOException{
        return 0;
    }

    public static void main(String[] args) throws IOException {

        ExceptionDemo2.tes("11");

        System.out.println("----begin----");

        String num1 = "10";

        String num2 = "2B";

        try {


            int n1 = Integer.parseInt(num1);

            int n2 = Integer.parseInt(num2);

            int result = n1 / n2;

            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("算术异常");
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("类型异常");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("其他异常");
        }


        System.out.println("-----end-----");

    }
}
