package study_part9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: Maventest
 * @description: InputStrem输入流
 * @author: 作者名称
 * @date: 2020-01-03 22:55
 **/
public class FileInputStremDemo {

    public static void main(String[] args) throws IOException {

        //1、创建源文件对接
        File file = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/test1");

        //2、创建流对象
        FileInputStream fi = new FileInputStream(file);

        //3、具体的操作方法
        //1、read方法
//        System.out.println(fi.read());//65
//        System.out.println(fi.read());//66
        //2、read(byte[])方法
        byte[] bytes= new byte[15];
//        System.out.println(fi.read(bytes));
//        System.out.println(fi.read(bytes));
//        System.out.println(fi.read(bytes));
//        System.out.println(fi.read(bytes));
//        int len = -1;
//        while ((len = fi.read(bytes))!=-1){
//            System.out.println(len);
//            System.out.println(new String(bytes,0,len));
//
//        }

        //3、read(byte[],int off,int len)方法
        System.out.println(fi.read(bytes,0,14));
//        fi.read(bytes,0,4);


//        String s = new String(bytes);
//        System.out.println(s);
        //4、关闭资源
        fi.close();

    }
}
