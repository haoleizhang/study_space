package study_part5;

/**
 * Created by biz on 2018/7/19.
 */
public class IDEADemo2 {
    public static void main(String[] agrs) {

        IDEADemo id = new IDEADemo("张三", 13, 1);
        System.out.println(id);

        System.out.println();

        System.out.println("start");

        for (int i = 0;i<10;i++){
            System.out.println(i);
            if (i == 5){
                System.out.println("要退出了");
                break;
            }
        }

        System.out.println("end");

    }
}
