package study_part4;

/**
 * Created by biz on 2018/7/9.
 * 单例设计模式：只能创建一个对象
 */
class arraysort{

    //1:先创建出一个对象
    public static final arraysort instence = new arraysort();
    //2:构造器用final修饰，防止在被创建对象
    private arraysort(){}
    //3:提供一个方法去获取对象
    public static arraysort getInstence(){
        return instence;
    }


    public void sort(int[] arr){
        System.out.println("数组排序");
    }

}



public class Singleton {

    public static void main(String[] args){

//        arraysort as = new arraysort();
//
//        as.sort(null);
//
//        as.sort(null);


        arraysort.getInstence().sort(null);
    }

}
