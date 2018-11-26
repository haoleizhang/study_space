package study_part1;

/**
 * Created by biz on 2018/6/10.
 * switch 支持的数据类型为byte,short,char,int
 * case后面必须要跟上break，要不然会穿透
 */
public class SwitchDemo {

    public static void main(String[] args) {

        int day = 1;
        switch (day){
            case 1:
                System.out.println("今天周一");
                break;
            case 2:
                System.out.println("今天周二");
                break;
            case 3:
                System.out.println("今天周三");
                break;
            case 4:
                System.out.println("今天周四");
                break;
            case 5:
                System.out.println("今天周五");
                break;
            case 6:
                System.out.println("今天周六");
                break;
            case 7:
                System.out.println("今天周日");
                break;
            default:
                System.out.println("以上都不是");
        }

        char ch = 'A';
        switch (ch){
            case 'C':
                System.out.println("这个是C");
                break;
            case 'B':
                System.out.println("这个是B");
                break;
            case 'A':
                System.out.println("这个是A");
                break;
            default:
                System.out.println("什么都不是是");
        }


    }
}
