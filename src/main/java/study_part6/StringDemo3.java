package study_part6;

/**
 * Created by biz on 2018/8/5.
 */


public class StringDemo3 {


    public static void main(String[] args){
        testnull();
    }

    /**
     * 判断字符串是否为空
     */
    private static void testnull() {

        String cs1 = "";//true
        String cs2 = " ";
        String cs3 = null;
        System.out.println(isnull(cs1));
        System.out.println(isnull(cs2));
        System.out.println(isnull(cs3));
        System.out.println(isnotnull(cs3));
    }

    private static boolean isnotnull(String str) {
        return !isnull(str);
    }

    private static boolean isnull(String str) {

        //1 正常判断
//        if (){
//            return true;
//        }
//        return false;

        //2 三目
//        return str != null && !"".equals(str.trim())?true:false;

        //3 高逼格

        return str != null && !"".equals(str.trim());

    }


}
