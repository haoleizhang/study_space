package study_part6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by biz on 2018/11/28.
 * <p>
 * 同步锁机制
 *
 * 并发内容详解：https://www.cnblogs.com/aishangJava/p/6555291.html
 */


class apple3 implements Runnable {

    private int number = 50;

    private Lock lock = new ReentrantLock();
    @Override
    public void run() {


        for (int i = 0; i < 50; i++) {
            eat();
        }


    }


    private void eat() {
        lock.lock();//获取锁
        if (number > 0)
            System.out.println(Thread.currentThread().getName() + "吃了第" + number-- + "个苹果");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();//释放锁
        }
    }
}

public class ThreadTestDemo3 {

    public static void main(String[] args) {

        apple3 a = new apple3();
        new Thread(a, "小A").start();
        new Thread(a, "小B").start();
        new Thread(a, "小C").start();
    }
}
