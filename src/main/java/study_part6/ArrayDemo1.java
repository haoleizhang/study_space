package study_part6;

/**
 * Created by biz on 2018/11/28.
 * 单例设计模式-饿汉式
 *
 * 推荐使用！！！！
 */


public class ArrayDemo1 {

    //构造器
    private ArrayDemo1() {
    }

    private final static ArrayDemo1 arrayDemo1 = new ArrayDemo1();


    public static ArrayDemo1 getArrayDemo1() {
        return arrayDemo1;
    }

    public void sort() {
    }
}
