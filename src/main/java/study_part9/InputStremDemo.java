package study_part9;

import java.io.*;

/**
 * @program: Maventest
 * @description: 字符流操作
 * @author: 作者名称
 * @date: 2020-01-06 23:56
 **/
public class InputStremDemo {

    public static void main(String[] args) throws Exception {

        File fi = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/chartest");

        Writer writer = new FileWriter(fi);
        Reader reader = new FileReader(fi);

        writer.write("这是一个Java程序");
        writer.flush();
//        System.out.println(reader.read());
//        System.out.println(reader.read());
//        System.out.println(reader.read());

        char[] chars = new char[3];
        int len;
        while ((len = reader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        reader.close();
        writer.close();

    }
}
