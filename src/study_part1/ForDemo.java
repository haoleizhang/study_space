package study_part1;

/**
 * Created by biz on 2018/6/11.
 * for(初始化语句；boolean表达式；循环后语句)
 */
public class ForDemo {
    public static void main(String[] args) {
        /*
        for循环执行顺序
        1、执行初始化语句（一般声明变量并赋值）
        2、boolean表达式
            true：执行第三部
            false:跳过循环
        3、执行循环体
        4、执行循环后语句
        5、进入第二步
         */


        //输出10次hello
        for (int i = 1;i < 10;i++){
            System.out.println("hello"+i);
        }

        //输出100以内的正整数

        for (int j = 1;j<=10;j++){
            System.out.println(j);
        }

        //计算100以内正整数的和
        int result = 0;
        for (int num = 1;num <= 100;num++){
            result += num;
        }
        System.out.println(result);


/*        for (System.out.println("初始化");;System.out.println("循环之后")){
            System.out.println("循环体");
        }*/
    }
}
