package study_part6;

/**
 * Created by biz on 2018/11/28.
 *
 * 单例---懒汉设计模式
 *
 * 双重检查加锁--线程安全，又能使性能不受很大的限制
 * <p>
 * <p>
 * volatile :被volatile修饰过的变量，不会被本地线程缓存，所有对该变量的读写都是直接操作的共享内存，从而确保多个线程能正确的处理该变量
 */


public class ArrayDemo2 {

    private ArrayDemo2() {
    }

    public static volatile ArrayDemo2 arraydemo2 = null;

    public static ArrayDemo2 getArraydemo2() {

        if (arraydemo2 == null) {
            synchronized (ArrayDemo2.class) {
                if (arraydemo2 == null) {
                    arraydemo2 = new ArrayDemo2();
                }
            }

        }
        return arraydemo2;
    }

}
