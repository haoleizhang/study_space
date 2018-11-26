package study_part6;

/**
 * Created by biz on 2018/8/5.
 */


public class StringDemo2 {


    public static void main(String[] args) {

        test1();
//        test2();

    }

    /**
     * 获取以hello开头的文件名的后缀名
     */
    private static void test2() {

        String filename = "abc.txt;hello.txt;hello.class;hello.java";
        //以'；'分割字符串
        String[] str1 = filename.split(";");

        for (String demo : str1
                ) {
            //筛选以hello开头的元素
            if (demo.startsWith("hello")) {
                //获取.的位置
                int start = demo.indexOf(".") + 1;
                String result = demo.substring(start);
                System.out.println(result);
            }


        }

    }

    /**
     * 把单词首字母大写
     */
    private static void test1() {

        String demo = "aashdjashjd";

        String c1 = demo.substring(0,1).toUpperCase();
        System.out.println(c1);

        String result = c1 + demo.substring(1);
        System.out.println(result);
    }
}
