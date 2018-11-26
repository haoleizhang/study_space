package study_part1;

/**
 * Created by biz on 2018/6/10.
 */
public class SwitchDemo2 {
    public static void main(String[] args) {

        int day = 4;
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天周末");
                break;
            default:
                System.out.println("以上都不是");
        }
    }
}
