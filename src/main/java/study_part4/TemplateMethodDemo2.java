package study_part4;

/**
 * Created by biz on 2018/7/11.
 */

abstract class TemplateDemo {

    public final long operate() {
        long start = System.currentTimeMillis();

        this.doWork();

        long end = System.currentTimeMillis();

        return end - start;
    }

    abstract public void doWork();
}

class StringOpe extends TemplateDemo {

    public void doWork() {
        String i = "ABC";
        for (int a = 0;a< 1000000;a++){
            i += "";
        }
    }
}

class IntOpe extends TemplateDemo{

    public void doWork(){
        int a = 0;
        for (int i = 0;i<1000000000;i++){
            a += 1;
        }
    }
}

public class TemplateMethodDemo2 {

    public static void main(String[] args){

        System.out.println(new IntOpe().operate());

        System.out.println(new StringOpe().operate());

    }
}
