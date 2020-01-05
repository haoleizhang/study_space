package study_part9;

import java.io.*;

/**
 * @program: Maventest
 * @description: 文件拷贝
 * @author: 作者名称
 * @date: 2020-01-05 16:05
 **/
public class FIleCopyDemo {
    public static void main(String[] args) throws Exception {

        File f1 = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/CopyDemo01");
        File f2 = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/CopyDemo02.Text");

        InputStream fi = new FileInputStream(f1);
        OutputStream out = new FileOutputStream(f2,true);
        OutputStream init = new FileOutputStream(f1,true);


        init.write(new String("ABCDEFGHIJKOPQRSTUVWXYZ").getBytes());

        byte[] bytes = new byte[10];
        int len ;

        while ((len = fi.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
            out.write(bytes,0,len);
        }

        fi.close();
        out.close();
        init.close();
    }
}
