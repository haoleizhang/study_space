package study_part7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanghaolei on 2018/11/29.
 * 线程等待及唤起
 * <p>
 * 同步锁必须选择多个线程共有的资源
 */
public class ShareDemo {

    //年龄
    private String name;
    //性别
    private String gender;

    private boolean isEmpty = true;

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    //推送数据
//    synchronized public void pushProduct(String name, String gender) {
//        try {
//            while (!isEmpty) {
//                this.wait();
//            }
//            this.name = name;
//            Thread.sleep(10);
//            this.gender = gender;
//            isEmpty = false;
//            this.notify();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    //获取数据
//    synchronized public void getSharDemo() {
//        try {
//            while (isEmpty){
//                this.wait();
//            }
//            Thread.sleep(10);
//            System.out.println(this.name + "  " + this.gender);
//            isEmpty = true;
//            this.notify();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }


    //推送数据
    public void pushProduct(String name, String gender) {
        try {
            //获取锁
            lock.lock();
            //用while的好处:可以执行多次，循环直到条件不满足
            while (!isEmpty) {
                //使进行等待，进度等待池
                condition.await();
            }
            this.name = name;
            Thread.sleep(10);
            this.gender = gender;
            isEmpty = false;
            //唤起线程，进入同步锁池
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //释放锁
            lock.unlock();
        }

    }

    //获取数据
    public void getSharDemo() {
        try {
            lock.lock();
            while (isEmpty) {
                condition.await();
            }
            Thread.sleep(10);
            System.out.println(this.name + "  " + this.gender);
            isEmpty = true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
