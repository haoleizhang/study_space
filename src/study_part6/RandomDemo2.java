package study_part6;
import java.util.Random;

/**
 * Created by biz on 2018/8/7.
 */


public class RandomDemo2 {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        str += str.toLowerCase();

        str += "0123456789";

        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<5;i++){

            char str1 = str.charAt(new Random().nextInt(str.length()));

            sb.append(str1);
        }
//        System.out.println(str);

        System.out.println(sb);

        System.out.println(str.charAt(new Random().nextInt(str.length())));
    }
}
