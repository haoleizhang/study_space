package study_part4;

/**
 * Created by biz on 2018/7/9.
 * 用final修饰的常量类Consts
 */
//final class Fruit final修饰的类不能被继承
class Fruit{
    //public final void test(){  final修饰的方法不能被重写覆盖
    public void test(){
        System.out.println("父类中的测试方法测试方法");
    }
}

class Apple extends Fruit{

    @Override
    public void test(){
        System.out.println("子类中的测试方法");
    }

}


public class FinalDemo {
    public static void main(String[] args){

        Fruit ft = new Apple();

        ft.test();
    }
}
