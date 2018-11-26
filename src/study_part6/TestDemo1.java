package study_part6;

/**
 * Created by biz on 2018/8/22.
 */


public class TestDemo1 {

    private static String[] strings = {"will","zhangsan","lisi"};


    public static void main(String[] args) {

        try {
            System.out.println(checkUserName("will"));
        } catch (ExceptionDemo5 e) {
            String message = e.getMessage();
            System.out.println(message);
        }

    }

    private static boolean checkUserName(String name){

        for (String els:strings
             ) {
            if(els.equals(name)){
                throw new ExceptionDemo5("亲" + name + ",已经被注册了");
            }
        }
        return true;
    }

}
