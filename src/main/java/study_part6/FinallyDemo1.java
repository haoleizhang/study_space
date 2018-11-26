package study_part6;

/**
 * Created by biz on 2018/8/22.
 */


public class FinallyDemo1 {
    public static void main(String[] args) {

        int a = test();
        System.out.println(a);
    }

    private static int test() {
        int a = 1;

        try {
            return
                    a;
        } finally {
            ++
                    a;
        }


    }
}
