package study_part9;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class IODemo01 {
    public static void main(String[] args) throws IOException {
        //获取属性分隔符
//        String pathSeparator = File.pathSeparator;
//        char pathSeparatorChar = File.pathSeparatorChar;
//        System.out.println(pathSeparator);
//        System.out.println(pathSeparatorChar);

        //获取路径分隔符
/*
        String separator = File.separator;
        char separatorChar = File.separatorChar;
        System.out.println(separator);
        System.out.println(separatorChar);
*/
        IODemo01 io = new IODemo01();
//        io.test1();
        io.test2();
        test3();

    }

    /*
       创建目录
     */
    private  static void test3() {

        File dir = new File("/Users/user/oa-platform/study_space/src/main/java/test_dir/test_2");
        System.out.println(dir.isDirectory());
        System.out.println(dir.exists());
        if (!dir.exists()){
            dir.mkdirs()  ;
        }else {
            dir.renameTo(new File("/Users/user/oa-platform/study_space/src/main/java/test_dir1"));
        }
    }


    /*
        创建文件
     */
    public void test2() throws IOException {

        File dir = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9");
        File file = new File(dir, "test.java");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        if (!file.exists()) {
            file.createNewFile();
        } else {
            file.renameTo(new File(dir, "xxx.java"));
        }
    }


    /*
    获取文件的路径
     */
    public void test1() {

        File f1 = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/IODemo01.java");

        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.canExecute());
        System.out.println(new Date(f1.lastModified()).toLocaleString());
        System.out.println(f1.length());
    }
}
