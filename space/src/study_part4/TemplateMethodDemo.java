package study_part4;

/**
 * Created by biz on 2018/7/11.
 * 模板设计方法
 */

//计算String连接10000次的时间

class StringOperate {

    public long doWork() {
        long start = System.currentTimeMillis();

        String a = "ABC";
        for (int i = 0; i < 1000000; i++) {
            a += "";
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

}


class IntOperate {

    public long doWork() {
        long start = System.currentTimeMillis();

        int a = 0;
        for (int i = 0; i < 100000000; i++) {
            a += 1;
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

}

public class TemplateMethodDemo {

    public static void main(String[] args) {

        System.out.println(new StringOperate().doWork());

        System.out.println(new IntOperate().doWork());
    }
}
