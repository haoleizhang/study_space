package study_part1;

/**
 * Created by biz on 2018/6/7.
 * 三元运算符/三目运算符
 */
public class TernaryOperatoeDemo {
    public static void main(String[] args) {

        //需求：现在给1个小数，要求算出四舍五入之后的结果

        double d = 4.65;

        int a = (int) d;

        double b = d - a;

        System.out.println(d);
        System.out.println(a);
        System.out.println(b);

//
//        if (b > 0.5){
//            d = a + 1;
//            System.out.println(d);
//        }else {
//            d = a;
//        }
//
//        System.out.println(d);


        int c = b > 0.5 ? a + 1: a;
        System.out.println(c);
        System.out.println("----------分割线----------");
        //判断2个数的大小

        int ai = 25;

        int ax = 19;

        int max = ai >= ax ? ai : ax;

        System.out.println(max);

        System.out.println("----------分割线----------");
        //判断一个数是奇数还是偶数

        int jd = 456;

        boolean result = jd % 2 == 0 ? true : false;

        System.out.println(result);

        System.out.println("----------分割线----------");
        //翻页功能

        int totalcount = 4120;

        int pagesize = 10;

        int page = totalcount % pagesize == 0? totalcount / pagesize : totalcount / pagesize + 1;

        System.out.println(page);

        System.out.println("----------分割线----------");

        //上一页

        int currentpage = 1;

        int prepage = currentpage - 1 <= 1 ? 1 : currentpage - 1;

        System.out.println(prepage);
    }
}
