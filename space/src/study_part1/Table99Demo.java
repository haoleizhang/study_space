package study_part1;

/**
 * Created by biz on 2018/6/13.
 * 输出9*9乘法表
 */
public class Table99Demo {
    public static void main(String[] args) {

            //初级
//        System.out.println("1 * 1 = 1");
//        System.out.println("1 * 1 = 1 2 * 2 = 4");
//        System.out.println("1 * 1 = 1 2 * 2 = 4 3 * 3 = 9");


        //规律：第二个乘数和行数相同，第一个乘数<=第二个乘数
        //中级
/*        int lenth = 1;
        for (int i = 1 ;i <= lenth;i++){
            System.out.print(i +" * "+ lenth + " = "+ i * lenth + "\t");
        }
        lenth++;
        System.out.println();
        for (int i = 1 ;i <= lenth;i++){
            System.out.print(i +" * "+ lenth + " = "+ i * lenth + "\t");
        }

        lenth++;
        System.out.println();
        for (int i = 1 ;i <= lenth;i++){
            System.out.print(i +" * "+ lenth + " = "+ i * lenth + "\t");
        }*/
        //简化
        for (int j =1; j<= 9;j++){
            for (int i = 1 ;i <= j;i++){
                System.out.print(i +" * "+ j + " = "+ i * j + "\t");
            }
            System.out.println();
        }

    }
}
