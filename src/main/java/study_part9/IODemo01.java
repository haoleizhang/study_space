package study_part9;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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
//        io.test2();
//        test3();
//        test4("/Users/user/oa-platform/study_space/src/main/java/test_dir");
        test5();
    }

    /**
     *列出某个文件的目录结构
     */
    private static void test5() {
        List<String> partlist = new ArrayList<>();

        File file = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/IODemo01.java");

        getParentFileName(partlist,file);

        System.out.println(partlist);

//颠倒list元素的顺序
        Collections.reverse(partlist);
        System.out.println(partlist);

        for (String l:partlist
             ) {
            if (!partlist.get(partlist.size()-1).equals(l)){
                System.out.print(l + "->");
            }else {
                System.out.print(l);
            }

        }
//        System.out.println(file.getParentFile().getName());
//        System.out.println(file.getParentFile().getParentFile().getName());
//        System.out.println(file.getParentFile().getParentFile().getParentFile().getName());
    }

    /**
     * 使用递归获取文件的上层目录
     * @param list
     * @param file
     */
    private static void getParentFileName(List<String> list, File file) {

        if (!"".equals(file.getParentFile().getName())){
            list.add(file.getParentFile().getName());
        }
        if (file.getParentFile().getParentFile()!=null){
            getParentFileName(list,file.getParentFile());
        }
    }


    /**
     * 使用递归输出某个路径下面的所有文件
     * @param dir
     */
    private static void test4(String dir) {

        File file  = new File(dir);
        File[] file2 = file.listFiles();
        for (File file1: file2
             ) {
            if (file1.isDirectory()){
//                System.out.println(file1.getName());
//                System.out.println(file1.getPath());
                test4(file1.getPath());
            }
            System.out.println(file1.getName());
        }
    }

    /*
       创建目录
     */
    private  static void test3() {

        File dir = new File("/Users/user/oa-platform/study_space/src/main/java/test_dir/test_2");
        System.out.println(dir.isDirectory());
        System.out.println(dir.exists());
        if (!dir.exists()){
            dir.mkdirs();
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
