package study_part9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @program: Maventest
 * @description: FileOutStrem操作
 * @author: 作者名称
 * @date: 2020-01-03 12:56
 **/
public class FileOutstremDemo01 {

    public static void main(String[] args) throws Exception {

        /*第一步:创建源对象或者目标对象，表示把数据存放到哪个文件或者从哪个文件读取数据*/
        File file = new File("/Users/user/oa-platform/study_space/src/main/java/study_part9/test1.json");
        /*第二步：创建连接对象*/
        OutputStream outputStream = new FileOutputStream(file,true);//appen参数：是否在源文件基础上追加
        /*第三步：具体的操作方法*/
        outputStream.write(97);//65-96是A-Z
        byte[] bytes = new byte[]{'j','a','v','a'};
        outputStream.write(bytes);

        String strings = "Java-Hello";
        byte[] chars = strings.getBytes();
        outputStream.write(chars);

        outputStream.write("hello-world".getBytes(),6,5);
        /*第四步：关闭资源对象*/
        outputStream.close();
    }
}
