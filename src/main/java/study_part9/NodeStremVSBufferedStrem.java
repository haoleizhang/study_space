package study_part9;

import java.io.*;

/**
 * @program: Maventest
 * @description: 节点流和缓冲流性能对比, 包装流性能对比
 * @author: 作者名称
 * @date: 2020-01-07 23:09
 **/
public class NodeStremVSBufferedStrem {


    public static void main(String[] args) throws Exception {

        File srcfile = new File("srcfile/employee员工基础数据.sql");
        File targetfile = new File("targetfile/employee.sql");
        File buffersrc = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/chartest");
        File buffertar = new File("targetfile/char1");

        //1和2对比
//        test1(srcfile, targetfile);
//        test2(srcfile, targetfile);
        //3和4对比
//        test3(srcfile, targetfile);
//        test4(srcfile,targetfile);

        //字符流操作
        testfile(buffersrc, buffertar);
    }

    //字符流操作,包装流提供了额外的方法（newLine、readLine）
    private static void testfile(File src, File tar) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(src));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tar));

        String len;
        while ((len = reader.readLine()) != null) {
            writer.write(len);
            writer.newLine();
            writer.write("-------");
            writer.newLine();
        }

        reader.close();
        writer.close();

    }


    //使用节点流，从硬盘文件中一个字节一个字节读写
    private static void test1(File srcfile, File targetfile) throws Exception {

        long starttime = System.currentTimeMillis();

        InputStream inputStream = new FileInputStream(srcfile);
        OutputStream outputStream = new FileOutputStream(targetfile);

        int len;
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }

        inputStream.close();
        outputStream.close();

        System.out.println(System.currentTimeMillis() - starttime);
    }

    //使用缓冲流，从内存中一个字节一个字节的读写
    private static void test2(File srcfile, File targetfile) throws Exception {
        long starttime = System.currentTimeMillis();

        InputStream inputStream = new BufferedInputStream(new FileInputStream(srcfile));
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetfile));

        int len;
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }

        inputStream.close();
        outputStream.close();

        System.out.println(System.currentTimeMillis() - starttime);
    }


    //使用节点流，从硬盘文件中每次读写1024个字节
    private static void test3(File srcfile, File targetfile) throws Exception {

        long starttime = System.currentTimeMillis();

        InputStream inputStream = new FileInputStream(srcfile);
        OutputStream outputStream = new FileOutputStream(targetfile);

        int len;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes);
        }


        inputStream.close();
        outputStream.close();
        System.out.println(System.currentTimeMillis() - starttime);
    }

    //使用缓冲流，从内存中每次读写1024个字节
    private static void test4(File srcfile, File targetfile) throws Exception {
        long starttime = System.currentTimeMillis();

        InputStream inputStream = new BufferedInputStream(new FileInputStream(srcfile));
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetfile));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes);
        }

        inputStream.close();
        outputStream.close();

        System.out.println(System.currentTimeMillis() - starttime);
    }

}
