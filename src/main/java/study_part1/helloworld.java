package study_part1;

import java.util.*;

/**
 * Created by biz on 2017/6/17.
 */
public class helloworld {

    List<String> list = new ArrayList<>();

    public void test() {

        String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


        Random random = new Random();

        int j = 10;


        for (int i = 0; i < 10; i++) {
            StringBuffer sb = new StringBuffer();
            for (int k = 0; k < j; k++) {
                int number = random.nextInt(string.length());
                sb.append(string.charAt(number));
            }
            if (list.contains(sb) == false) {
                list.add(sb.toString());
                j--;
            }
        }


    }


    public void testforeach() {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void testsort() {

        Collections.sort(list);
    }

    public static void main(String[] args) {

        helloworld hello = new helloworld();
        hello.test();
        hello.testforeach();
        hello.testsort();
        System.out.println("排序后--------------------");
        hello.testforeach();
    }
}
