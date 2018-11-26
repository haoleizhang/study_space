package study_part6;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by biz on 2018/8/7.
 */


public class RandomDemo1 {

    public static void main(String[] args) {

        //random

        Random rd = new Random(10);

        System.out.println(rd.nextInt());

        Random rd1 = new Random(10);

        System.out.println(rd.nextInt());


//        ThreadLocalRandom

        ThreadLocalRandom tlr = ThreadLocalRandom.current();

        //生成10到100之间的随机数
        System.out.println(tlr.nextInt(10,100));

        //UUId
        System.out.println(UUID.randomUUID().toString());
    }
}
