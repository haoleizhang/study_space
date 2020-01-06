package study_part9;

import java.io.*;

/**
 * @program: Maventest
 * @description: 动态编译和运行Java代码
 * @author: 作者名称
 * @date: 2020-01-06 22:57
 **/
public class ProcessDemo {
    public static void main(String[] args) throws Exception {

        String s = "System.out.println(\"这是一个动态编译和运行java代码的Demo\");";

        eval(s);
    }

    /**
     * eval方法
     *
     * @param s
     */
    private static void eval(String s) throws Exception {

//        1、生成java代码
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("public class Hello{");
        stringBuilder.append("public static void main(String[] args) {");
        stringBuilder.append("System.out.println(\"这是一个Java程序\");");
        stringBuilder.append("}}");

        System.out.println(stringBuilder);

//        2、保存到一个hello.java的文件中
        OutputStream out = new FileOutputStream(new File("Hello.java"));

        out.write(stringBuilder.toString().getBytes());
        out.close();

//        3、使用javac编译Hello.java
        Process process = Runtime.getRuntime().exec("javac Hello.java");
//        4、获取进程中的数据(异常数据)
        byte[] bytes = new byte[1024];
        InputStream in = process.getErrorStream();

        int len;
        while ((len = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        in.close();
//        5、运行Hello.java,并获取进程中的数据
        Process process1 = Runtime.getRuntime().exec( "java Hello");
        InputStream in1 = process1.getInputStream();


        while ((len = in1.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        in1.close();

//        6、删除临时文件
        new File("Hello.java").delete();
        new File("Hello.class").delete();
    }
}
