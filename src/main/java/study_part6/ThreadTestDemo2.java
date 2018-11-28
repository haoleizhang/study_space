package study_part6;

/**
 * Created by zhanghaolei on 2018/11/27.
 * StringBuffer比StringBuild（多线程建议使用build）
 * 安全但是性能低 原因是因为：synchronized
 * 尽量减少synchronized的作用域
 */

class apple implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */

    private int number = 50;

//    @Override
//    public void run() {
//
//        for (int i = 0; i < 50; i++) {
//            synchronized (this) {
//                if (number > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "吃了第" + number-- + "个苹果");
//                }
//            }
//        }
//
//    }


    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            eat();
        }
    }


    synchronized private void eat(){
        if (number >0){
            System.out.println(Thread.currentThread().getName() +"吃了第"+number-- +"个苹果");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadTestDemo2 {
    public static void main(String[] args) {

        apple a = new apple();
        new Thread(a, "小A").start();
        new Thread(a, "小B").start();
        new Thread(a, "小C").start();
    }
}
