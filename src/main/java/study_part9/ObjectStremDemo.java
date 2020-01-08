package study_part9;

import java.io.*;

/**
 * @program: Maventest
 * @description: 序列号和反序列化
 * @author: 作者名称
 * @date: 2020-01-08 23:22
 **/
public class ObjectStremDemo {
    public static void main(String[] args) throws Exception {


        File file = new File("targetfile/object");

        ObjectStremDemo.out(file);
        ObjectStremDemo.in(file);
    }

    private static void out(File file) throws Exception {

        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(file));

        objectOutput.writeObject(new UserDemo("张三", "password", 18));

        System.out.println(objectOutput.toString());

        objectOutput.close();
    }

    private static void in(File file) throws Exception {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        UserDemo userDemo = (UserDemo) objectInputStream.readObject();

        System.out.printf(userDemo.toString());

        objectInputStream.close();
    }
}
